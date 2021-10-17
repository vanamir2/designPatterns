package cz.vanamir2.solid.intsegreg.exercise.template;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, final Door door) {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask() {
            @Override
            public void run() {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}
