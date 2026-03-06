public class ToDoItem {
    private String description;
    private boolean isDone;

    // a constructor to initialize the item with the description, and isDone as false,
    // with a single parameter for the description
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    // getters and setters for each field
    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public boolean getDescription(String description) {
        this.description = description;
        return true;
    }

    public boolean setIsDone(boolean isDone) {
        this.isDone = isDone;
        return true;
    }
}