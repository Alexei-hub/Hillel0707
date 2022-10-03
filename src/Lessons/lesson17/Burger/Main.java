package Lessons.lesson17.Burger;

public class Main {

    public static void main(String[] args) {
        Ingredient ingredient = new Ingredient();
        ingredient.addingIngredients();
        ingredient.showIngredients();

        Logic logic = new Logic(ingredient);

        System.out.println("Стоимость базового бургера " + logic.getBurgerPrice());
        System.out.println("Выберите доп. ингредиент:");

        logic.burgerConstructor();

        System.out.println("Цена бургера " + logic.getBurgerPrice() + "грн");

    }
}
