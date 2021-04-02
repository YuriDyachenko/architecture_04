package kurs.composite;

public class Task {
    private final String name;
    private final int hours;

    public Task(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Задача{" + name + ", " + hours + "ч.}";
    }
}
