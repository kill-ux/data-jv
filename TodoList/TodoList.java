enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

class Task {
    private String description;
    private TaskStatus status;

    public Task(String description) {
        setDescription(description);
        setStatus(TaskStatus.NEW);
    }
   
    public TaskStatus getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count = 0;

    public TodoList(int capacity) {
        this.capacity = capacity;
        tasks = new Task[capacity];
    }

    public void addTask(String description) {
        if (count < this.capacity) {
            Task task = new Task(description);
            tasks[count] = task;
            count ++;
        }
        
    }

    public void setStatus(int index, TaskStatus status) {
        if (index >= 0 && index <= count) {
            tasks[index].setStatus(status);
        }
    };

    public void setDescription(int index, String newDescription) {
        if (index >= 0 && index <= count) {
            tasks[index].setDescription(newDescription);
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (Task task: tasks) {
            if (task == null) break;
            System.out.println(String.format("%-33s | %s",task.getDescription() , task.getStatus()));
        }
    }
}