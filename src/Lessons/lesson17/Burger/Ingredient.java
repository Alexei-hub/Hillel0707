package Lessons.lesson17.Burger;

import java.util.HashMap;
import java.util.Map;

public class Ingredient {

    private final HashMap<String, Ingredients> INGREDIENTS = new HashMap<>();

    public void addingIngredients() {
        INGREDIENTS.put("1", Ingredients.CHEESE);
        INGREDIENTS.put("2", Ingredients.CUTLET);
        INGREDIENTS.put("3", Ingredients.SAUCE);
    }

    public void showIngredients() {
        for (Map.Entry<String, Ingredients> i : INGREDIENTS.entrySet()) {
            System.out.println(i.getKey() + " - " + i.getValue() + " = " + i.getValue().getPrice() + "грн");
        }
    }

    public int getIngredientPrice(String ingredientsName) {
        int price = 0;
        for (Map.Entry<String, Ingredients> i : INGREDIENTS.entrySet()) {
            if (isNumeric(ingredientsName)) {
                if (i.getKey().equals(ingredientsName)) {
                    price = i.getValue().getPrice();
                }
            } else {
                Ingredients ingredientName = Ingredients.valueOf(ingredientsName);
                if (i.getValue().equals(ingredientName)) {
                    price = i.getValue().getPrice();
                }
            }
        }
        return price;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
