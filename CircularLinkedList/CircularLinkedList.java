public class CircularLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
        if (index < 0 ) return -1;
        return find(index).value ;
    }

    public Node find(int index) {
        Node current = head;
        int id = 0;
        while(current != null) {
            if (id == index) break;
            current = next(current);
            id++;
        }
        return current;
    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        Node node = new Node(value);
        if (head == null) {
            head = node;
            head.next = head;
        } else {
            Node lastNode = find(this.size - 1);
            node.next = head;
            lastNode.next = node;
        }
        this.size++;
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if (index == 0) {
            Node node = find(this.size - 1);
            node.next = head = next(node.next);
        } else {
            Node node = find( index - 1);
            node.next = next(node.next);
        }
        this.size--;
    }

    @Override
    public int size() {
        // Implementation getting the size of the list
        return this.size;
    }

    private Node next(Node node) {
        // Print the message "Go to next node"
        System.out.println("Go to next node");
        return node.next;
    }
}