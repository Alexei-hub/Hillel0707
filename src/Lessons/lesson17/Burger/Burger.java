package Lessons.lesson17.Burger;

public class Burger {

    private int burgerPrice = 50;

    public int countBurgerFinalPrice(int newPrice) {
        return burgerPrice + newPrice;
    }

    public int getBurgerPrice() {
        return burgerPrice;
    }

    public void setBurgerPrice(int burgerPrice) {
        this.burgerPrice = burgerPrice;
    }
}
