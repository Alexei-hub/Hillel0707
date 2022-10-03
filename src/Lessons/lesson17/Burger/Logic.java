package Lessons.lesson17.Burger;

import java.util.Scanner;

public class Logic extends Burger {
    Ingredient ingredient;

    public Logic(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void burgerConstructor() {
        String userAnswer;
        for (int i = 2; i <= Ingredients.values().length; i++) {
            userAnswer = new Scanner(System.in).nextLine();
            if (i != 2 & userAnswer.equalsIgnoreCase("нет")) break;
            int price = ingredient.getIngredientPrice(userAnswer);
            setBurgerPrice(countBurgerFinalPrice(price));
            if (i == Ingredients.values().length) break;
            System.out.println("хотите ли добавить " + (i) + "-й доп. ингредиент:");
        }
    }
}
