package kurs.composite;

import java.util.Objects;

public class Programmer implements AbleToDoTask {
    private final String name;
    private final int hours;

    public Programmer(String name, int hours) {
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
        return "Программист{" + name + ", задачи до " + hours + "ч.}";
    }

    @Override
    public boolean canDoTask(Task task) {
        return getHours() >= task.getHours();
    }

    @Override
    public void doTask(Task task) {
        if (canDoTask(task)) {
            System.out.printf("Я - %s - выполняю %s...\n", this, task);
        } else {
            System.out.printf("Я - %s - НЕ МОГУ выполнить %s...\n", this, task);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return hours == that.hours && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hours);
    }
}
