package com.example.android.cityrides;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    protected Button sign_btn;
    protected EditText uname;
    protected EditText email;
    protected EditText licence;
    protected EditText pass;
    protected EditText contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        uname =(EditText)findViewById(R.id.username);
        email =(EditText)findViewById(R.id.email);
        licence =(EditText)findViewById(R.id.license);
        pass =(EditText)findViewById(R.id.password);
        contact =(EditText)findViewById(R.id.contact_number);

        sign_btn=(Button)findViewById(R.id.signup_button);
        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname1= uname.getText().toString().trim();
                String email1= email.getText().toString().trim();
                String licence1= licence.getText().toString().trim();
                String pass1= pass.getText().toString().trim();
                String contact1= contact.getText().toString().trim();
                if( uname1.isEmpty() || email1.isEmpty() || licence1.isEmpty() || pass1.isEmpty() || contact1.isEmpty()){
                    AlertDialog.Builder builder=new AlertDialog.Builder(SignUpActivity.this);
                    builder.setMessage("Make Sure all the fields have been entered properly")
                            .setTitle("Ooops!")
                            .setPositiveButton(android.R.string.ok, null);
                    AlertDialog dialog=builder.create();
                    dialog.show();
                }
                else {
                    Intent intent = new Intent(SignUpActivity.this, MapsActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

}
