// Реализация рецепта шашлыка с говядиной
public class BeefShashlikRecipe implements ShashlikRecipe {
    @Override
    public void prepareIngredients() {
        System.out.println("Подготовка мяса (говядина) к шашлыку...");
    }

    @Override
    public void marinate() {
        System.out.println("Мариновка мяса в специях и масле...");
    }

    @Override
    public void skewer() {
        System.out.println("Нанизывание мяса на шампуры...");
    }

    @Override
    public void grill() {
        System.out.println("Жарка шашлыка на гриле или углях...");
    }

    @Override
    public void serve() {
        System.out.println("Подача шашлыка с овощами и соусом...");
    }
}
