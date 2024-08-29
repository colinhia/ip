public class Event extends Task {
    private String start;
    private String end;
    public Event(String task, String start, String end) {
        super(task);
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return String.format("[E] %s (from: %s to: %s)", super.toString(), start, end);
    }

    @Override
    public String toStorageString() {
        return String.format("E | %s | %s | %s",this.taskString, this.start, this.end);
    }
}
