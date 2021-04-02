package kurs.decorator;

public class BlackCoffee implements Coffee {
    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String getStructure() {
        return "кофе";
    }

    @Override
    public String toString() {
        return "BlackCoffee{цена: " + getPrice() + ", состав: " + getStructure() +"}";
    }
}
