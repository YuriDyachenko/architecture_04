package kurs.decorator;

public class DecoratorExample {
    public void run() {
        System.out.println("---------- Декоратор/Decorator ----------");
        Coffee blackCoffee = new BlackCoffee();
        System.out.println("Черный кофе - " + blackCoffee);
        Coffee milkCoffee = new MilkCoffee(blackCoffee);
        System.out.println("Кофе с молоком - " + milkCoffee);
        Coffee vanillaCoffee = new VanillaCoffee(blackCoffee);
        System.out.println("Кофе с ванилью - " + vanillaCoffee);
        Coffee vanillaMilkCoffee = new VanillaCoffee(milkCoffee);
        System.out.println("Кофе с молоком и ванилью - " + vanillaMilkCoffee);
    }
}
