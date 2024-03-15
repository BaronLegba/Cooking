// Класс, представляющий приготовление шашлыка
public class ShashlikPreparation {
    private final ShashlikRecipe recipe;

    // Конструктор, принимающий рецепт шашлыка
    public ShashlikPreparation(ShashlikRecipe recipe) {
        this.recipe = recipe;
    }

    // Метод для приготовления шашлыка
    public void prepareShashlik() {
        recipe.prepareIngredients();
        recipe.marinate();
        recipe.skewer();
        recipe.grill();
        recipe.serve();
    }

    // Точка входа в программу
    public static void main(String[] args) {
        // Создаем экземпляр рецепта шашлыка с говядиной
        ShashlikRecipe beefShashlikRecipe = new BeefShashlikRecipe();

        // Создаем экземпляр класса для приготовления шашлыка и передаем ему рецепт
        ShashlikPreparation shashlikPreparation = new ShashlikPreparation(beefShashlikRecipe);

        // Вызываем метод для приготовления шашлыка
        shashlikPreparation.prepareShashlik();
    }
}
