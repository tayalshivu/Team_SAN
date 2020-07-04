package com.hackathon.team_san;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Job_Seeker extends AppCompatActivity {

    EditText email,pass;
    TextView register;
    Button login;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__job__seeker);

        email=findViewById(R.id.email);
        pass=findViewById(R.id.password1);
        login=findViewById(R.id.login);

        register=findViewById(R.id.register);

        preferences=getSharedPreferences("userinfo",MODE_PRIVATE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = email.getText().toString();
                String password = pass.getText().toString();
                String regusername = preferences.getString("username","");
                String regpassword = preferences.getString("password","");
                if (username.equals(regusername) && password.equals(regpassword)){
                    startActivity(new Intent(Login_Job_Seeker.this,Form.class));
                    Toast.makeText(Login_Job_Seeker.this, "Login Successfully....", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Job_Seeker.this,Register_Job_Seeker.class));
                finish();
            }
        });
    }
}
