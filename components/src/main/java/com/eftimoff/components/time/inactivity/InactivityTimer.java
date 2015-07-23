package com.eftimoff.components.time.inactivity;

import android.os.Handler;

/**
 * Timer to to be activated after some time of inactivity.
 * <p/>
 * Created by georgi.eftimov on 23/07/2015.
 */
public class InactivityTimer {

    private static final int DEFAULT_MILLISECONDS = 5 * 60 * 1000;

    private static InactivityTimer instance;
    //milliseconds to for inactivity.
    private final long milliseconds;
    private InactivityTimerListener inactivityTimerListener;
    private Handler handler = new Handler();

    private Runnable callback = new Runnable() {
        @Override
        public void run() {
            notifyListenerDone();
        }
    };

    private void notifyListenerDone() {
        if (inactivityTimerListener != null) {
            inactivityTimerListener.onDone();
        }
    }

    public static InactivityTimer getInstance() {
        return getInstance(DEFAULT_MILLISECONDS);
    }

    public static InactivityTimer getInstance(final long milliseconds) {
        if (instance == null) {
            synchronized (InactivityTimer.class) {
                if (instance == null) {
                    instance = new InactivityTimer(milliseconds);
                }
            }
        }
        return instance;
    }

    private InactivityTimer(final long milliseconds) {
        this.milliseconds = milliseconds;
    }

    public void setInactivityTimerListener(final InactivityTimerListener inactivityTimerListener) {
        this.inactivityTimerListener = inactivityTimerListener;
    }

    public void resetTimer() {
        handler.removeCallbacks(callback);
        handler.postDelayed(callback, milliseconds);
    }

    public void stopTimer() {
        handler.removeCallbacks(callback);
    }
}
