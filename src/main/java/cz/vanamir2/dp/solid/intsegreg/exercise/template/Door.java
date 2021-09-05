package cz.vanamir2.dp.solid.intsegreg.exercise.template;

public interface Door {
    void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback();

    void proximityCallback();
}
