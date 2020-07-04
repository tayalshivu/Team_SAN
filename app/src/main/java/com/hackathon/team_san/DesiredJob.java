package com.hackathon.team_san;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class DesiredJob extends AppCompatActivity {

    EditText industry_pref,role_pref,expec_sal,desired_loc,desired_shift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desired_job);

        industry_pref=findViewById(R.id.industry_pref);
        role_pref=findViewById(R.id.role_pref);
        expec_sal=findViewById(R.id.expec_salary);
        desired_loc=findViewById(R.id.desired_location);
        desired_shift=findViewById(R.id.desired_shift);

        String industry_pref1=industry_pref.getText().toString().trim();
        String role_pref1=role_pref.getText().toString().trim();
        String expec_sal1=expec_sal.getText().toString().trim();
        String desired_loc1=desired_loc.getText().toString().trim();
        String desired_shift1=desired_shift.getText().toString().trim();

    }
}
