package cz.vanamir2.dp.solid.intsegreg.exercise.solution;

import java.util.Random;

public class Sensor {
    public void register(Proximity proximity) {
        while (true) {
            if (isPersonClose()) {
                proximity.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}
