package cz.vanamir2.solid.intsegreg.exercise.solution;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, final Timeout timeout) {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask() {
            @Override
            public void run() {
                timeout.timeOutCallback();
            }
        }, timeOut);
    }
}
