package com.eftimoff.androidcomponents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.eftimoff.components.time.inactivity.InactivityTimer;
import com.eftimoff.components.time.inactivity.InactivityTimerListener;

public class InactivityTimerActivity extends AppCompatActivity {

    private InactivityTimer inactivityTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        inactivityTimer = InactivityTimer.getInstance(10 * 1000);
        inactivityTimer.setInactivityTimerListener(new InactivityTimerListener() {
            @Override
            public void onDone() {
                Toast.makeText(InactivityTimerActivity.this, "Times up.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onUserInteraction() {
        inactivityTimer.resetTimer();
    }

    @Override
    public void onResume() {
        super.onResume();
        inactivityTimer.resetTimer();
    }

    @Override
    public void onStop() {
        super.onStop();
        inactivityTimer.stopTimer();
    }
}
