package kurs.composite;

public interface AbleToDoTask {
    boolean canDoTask(Task task);
    void doTask(Task task);
}
