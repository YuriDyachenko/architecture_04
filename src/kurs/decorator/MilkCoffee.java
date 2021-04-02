package kurs.decorator;

public class MilkCoffee implements Coffee {
    private final Coffee base;

    public MilkCoffee(Coffee base) {
        this.base = base;
    }

    @Override
    public int getPrice() {
        return base.getPrice() + 5;
    }

    @Override
    public String getStructure() {
        return base.getStructure() + ", молоко";
    }

    @Override
    public String toString() {
        return "MilkCoffee{цена: " + getPrice() + ", состав: " + getStructure() +"}";
    }
}
