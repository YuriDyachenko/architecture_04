package kurs.composite;

public class CompositeExample {
    public void run() {
        System.out.println("---------- Компоновщик/Composite ----------");
        Programmer yuri = new Programmer("Юрий", 4);
        Programmer petr = new Programmer("Петр", 5);
        Programmer serg = new Programmer("Сергей", 3);
        System.out.println(yuri);
        System.out.println(petr);
        System.out.println(serg);
        Team javaTeam = new Team();
        javaTeam.add(yuri);
        javaTeam.add(petr);
        javaTeam.add(serg);
        System.out.println(javaTeam);
        Task longTask = new Task("Нарисовать диаграмму классов", 10);
        Task shotTask = new Task("Написать этот компоновщик", 2);
        System.out.println(longTask);
        System.out.println(shotTask);
        javaTeam.doTask(longTask);
        javaTeam.doTask(shotTask);
    }
}
