package cz.vanamir2.dp.creational.factories.abstr;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour "
                        + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}

