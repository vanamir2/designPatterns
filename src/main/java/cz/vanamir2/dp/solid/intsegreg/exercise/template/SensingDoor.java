package cz.vanamir2.dp.solid.intsegreg.exercise.template;

public class SensingDoor implements Door {
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor) {
        sensor.register(this);
    }

    @Override
    public void lock() {
        _locked = true;
    }

    @Override
    public void unlock() {
        _locked = false;
    }

    @Override
    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close() {
        _opened = false;
    }

    @Override
    public void timeOutCallback() {
        // not implemented
    }

    @Override
    public void proximityCallback() {
        _opened = true;
    }
}
