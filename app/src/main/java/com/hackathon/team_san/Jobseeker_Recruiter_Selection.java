package com.hackathon.team_san;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Jobseeker_Recruiter_Selection extends AppCompatActivity {

    TextView jobseeker,recruiter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobseeker__recruiter__selection);

        jobseeker=findViewById(R.id.job_seeker);
        recruiter=findViewById(R.id.recruiter);

        jobseeker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Jobseeker_Recruiter_Selection.this,Login_Job_Seeker.class));
            }
        });

        recruiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Jobseeker_Recruiter_Selection.this,Login_Recruiter.class));
            }
        });
    }
}
