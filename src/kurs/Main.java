package kurs;

import kurs.composite.CompositeExample;
import kurs.decorator.DecoratorExample;

public class Main {

    public static void main(String[] args) {
        //пример использования компоновщика
        new CompositeExample().run();
        //пример использования декоратора
        new DecoratorExample().run();
    }
}
