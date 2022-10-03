package Lessons.lesson17.Burger;

public enum Ingredients {
    CHEESE(20),
    CUTLET(30),
    SAUCE(10);

    private int price;

    Ingredients(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
