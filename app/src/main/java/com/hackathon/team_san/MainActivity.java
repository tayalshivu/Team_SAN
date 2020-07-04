package com.hackathon.team_san;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread startTimer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    Intent intent0 = new Intent(MainActivity.this, Jobseeker_Recruiter_Selection.class);
                    startActivity(intent0);
                    overridePendingTransition(R.transition.fadin, R.transition.fadout);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        startTimer.start();

    }
}
