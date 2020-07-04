package com.hackathon.team_san;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register_Recruiter extends AppCompatActivity {

    EditText email,pass,cnfrmpass;
    TextView login;
    Button register;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__recruiter);

        login=findViewById(R.id.login);

        email=findViewById(R.id.email);
        pass=findViewById(R.id.password1);
        cnfrmpass=findViewById(R.id.cnfrmpass1);

        register=findViewById(R.id.register);

        preferences=getSharedPreferences("userinfo",MODE_PRIVATE);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = email.getText().toString();
                String password = pass.getText().toString();
                if (TextUtils.isEmpty(username)){
                    email.setError("Please Enter a username");
                }
                else if (TextUtils.isEmpty(password)){
                    pass.setError("Please Enter a Password");
                }
                else if (password.length() < 8){
                    pass.setError("Password length must be greater than 8");
                }
                else{
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("username",username);
                    editor.putString("password",password);
                    editor.commit();
                    Toast.makeText(Register_Recruiter.this, "Registered...", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Register_Recruiter.this,Login_Job_Seeker.class));
                    finish();
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register_Recruiter.this,Login_Recruiter.class));
                finish();
            }
        });

    }
}
