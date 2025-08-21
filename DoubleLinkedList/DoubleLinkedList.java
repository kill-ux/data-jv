public class DoubleLinkedList implements LinkedList {
    private Node head;
    private Node tail;
    private int count = 0;

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    @Override
    public int at(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        // System.out.println(count);
        // System.out.println(index + " # " + count / 2);
        if (index < count / 2 ) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = next(current);
            }
            return current.value;
        } else {
            // Traverse backward from tail
            Node current = tail;
            for (int i = count - 1; i > index; i--) {
                current = prev(current);
            }
            return current.value;
        }
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        int id = 0;
        Node node = head;
        while (node != null) {
            if (id == index) {
                if (prev(node) == null) {
                    head = next(node);
                } else {
                    node.prev.next = next(node);
                }
                count--;
                break;
            }
            id++;
            node = next(node);
        }
    }

    @Override
    public int size() {
        // Implementation for getting the size of the list
        return count;
    }

    private Node next(Node node) {
        // Implementation for going to the next
        System.out.println("Go to next node");
        return node.next;
    }

    private Node prev(Node node) {
        // Implementation for going to the prev
        System.out.println("Go to previous node");
        return node.prev;
    }
}