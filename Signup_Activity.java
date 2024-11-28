package com.example.login_activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Signup_Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_3);

        EditText sign1 = findViewById(R.id.sign1);
        EditText sign2 = findViewById(R.id.sign2);
        EditText sign3 = findViewById(R.id.sign3);
        EditText sign4 = findViewById(R.id.sign4);
        EditText sign5 = findViewById(R.id.sign5);
        Button button  = findViewById(R.id.button_sign);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name     = sign1.getText().toString();
                String e_mail   = sign2.getText().toString();
                String username = sign3.getText().toString();
                String password = sign4.getText().toString();
                String re_pass  = sign5.getText().toString();

                if (!name.isEmpty()) {
                    sign1.setText(name);
                }

                if (!e_mail.isEmpty()) {
                    sign2.setText(e_mail);
                }

                if (!username.isEmpty()) {
                    sign3.setText(name);
                }
                if(password.isEmpty() && re_pass.isEmpty()){
                    Toast.makeText(Signup_Activity.this,"its Empty fill it", Toast.LENGTH_LONG).show();

                }

                if (!password.isEmpty()) {
                    if(password.length()<=8){
                        sign4.setText(password);
                    }else{
                        Toast.makeText(Signup_Activity.this,"Passwords should be 8 characters", Toast.LENGTH_LONG).show();
                    }
                }

                if (!re_pass.isEmpty()) {
                    sign5.setText(re_pass);
                }

                if( password.isEmpty() && re_pass.isEmpty()){
                    Toast.makeText(Signup_Activity.this,"passwords do not match", Toast.LENGTH_LONG).show();
                }else if(password.equals(re_pass)){
                    Toast.makeText(Signup_Activity.this,"passwords match", Toast.LENGTH_SHORT).show();

                }

                if (!name.isEmpty() && !e_mail.isEmpty() && !username.isEmpty() && !password.isEmpty() && !re_pass.isEmpty()
                        &&password.equals(re_pass) && password.length()<=8) {

                    Toast.makeText(Signup_Activity.this, "Sign In Successful", Toast.LENGTH_LONG).show();

                    Intent intent1 = new Intent(Signup_Activity.this,MainActivity.class);
                    startActivity(intent1);
                } else {
                    Toast.makeText(Signup_Activity.this, "Enter valid details", Toast.LENGTH_LONG).show();
                }

            }

        });


    }
}
