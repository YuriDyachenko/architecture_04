package kurs.decorator;

public class VanillaCoffee implements Coffee {
    private final Coffee base;

    public VanillaCoffee(Coffee base) {
        this.base = base;
    }

    @Override
    public int getPrice() {
        return base.getPrice() + 3;
    }

    @Override
    public String getStructure() {
        return base.getStructure() + ", ваниль";
    }

    @Override
    public String toString() {
        return "VanillaCoffee{цена: " + getPrice() + ", состав: " + getStructure() +"}";
    }
}
