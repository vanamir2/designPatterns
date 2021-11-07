package cz.vanamir2.dp.creational.factories.abstr;

public class Main {

    public static void main(String[] args) throws Exception {
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        HotDrink drink = hotDrinkMachine.makeDrink();
        drink.consume();
    }
}
