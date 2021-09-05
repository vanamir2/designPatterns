package cz.vanamir2.dp.solid.liskovsubs.exercise.solution;

public interface IDuck {

    public void quack() throws IDuckException;

    public void swim() throws IDuckException;

    class IDuckException extends Exception {

        public IDuckException(String message) {
            super(message);
        }
    }

}
