package cz.vanamir2.dp.creational.factories.abstr;

class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}
