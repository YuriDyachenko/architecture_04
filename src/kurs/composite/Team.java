package kurs.composite;

import java.util.ArrayList;

public class Team implements AbleToDoTask {
    private final ArrayList<Programmer> programmers = new ArrayList<>();

    public void add(Programmer programmer) {
        if (programmers.contains(programmer)) return;
        programmers.add(programmer);
    }

    public void remove(Programmer programmer) {
        if (!programmers.contains(programmer)) return;
        programmers.remove(programmer);
    }

    @Override
    public String toString() {
        return "Команда{" + "programmers=" + programmers + '}';
    }

    @Override
    public boolean canDoTask(Task task) {
        for (Programmer p: programmers) {
            if (!p.canDoTask(task)) return false;
        }
        return true;
    }

    @Override
    public void doTask(Task task) {
        if (!canDoTask(task)) {
            System.out.printf("Я - %s - НЕ МОЖЕМ выполнить %s...\n", this, task);
            return;
        }
        for (Programmer p: programmers) {
            p.doTask(task);
        }
    }
}
