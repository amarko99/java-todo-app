public class Task {
    private String description;
    private boolean done;

    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void markAsDone() {
        this.done = true;
    }

    @Override
    public String toString() {
        return (done ? "[X] " : "[ ] ") + description;
    }
}
