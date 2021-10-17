package cz.vanamir2.solid.liskovsubs.exercise.solution;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(IDuck... ducks) {
        for (IDuck duck : ducks) {
            try {
                duck.quack();
            } catch (IDuck.IDuckException e) {
                e.printStackTrace();
            }
        }
    }

    private void swim(IDuck... ducks) {
        for (IDuck duck : ducks) {
            try {
                duck.swim();
            } catch (IDuck.IDuckException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
