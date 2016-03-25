package com.example.android.cityrides;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    protected Button Signup_btn;
    protected Button login_btn;
    protected EditText email;
    protected EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        email=(EditText)findViewById(R.id.email_id);
        password = (EditText) findViewById(R.id.psswrd_id);
        Signup_btn =(Button) findViewById(R.id.signup);
        Signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        login_btn =(Button)findViewById(R.id.login);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1= email.getText().toString().trim();
                String pass= password.getText().toString().trim();
                if (email1.isEmpty() || pass.isEmpty()){
                    AlertDialog.Builder builder=new AlertDialog.Builder(LoginActivity.this);
                        builder.setMessage("Please Make Sure Email and Password have been entered properly!")
                                .setTitle("Oops!")
                                .setPositiveButton(android.R.string.ok, null);
                    AlertDialog dialog=builder.create();
                    dialog.show();
                }
                else {
                    Intent intent = new Intent(LoginActivity.this, MapsActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

}
