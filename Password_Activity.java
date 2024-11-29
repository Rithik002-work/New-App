package com.example.login_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Password_Activity extends AppCompatActivity  {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_4);
        EditText pass1 = findViewById(R.id.pass1);
        EditText pass2 = findViewById(R.id.pass2);
        Button button = findViewById(R.id.forgot_button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = pass1.getText().toString();
                String re_password = pass2.getText().toString();

                if(!password.isEmpty()) {
                    if (password.length() >= 8 ) {
                        pass1.setText(password);
                    }else{
                        Toast.makeText(Password_Activity.this,"password should be more than 8 characters", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(Password_Activity.this,"Passwords should not be Empty", Toast.LENGTH_LONG).show();

                }
                if(!re_password.isEmpty()){
                    pass2.setText(re_password);
                }

                if(password.equals(re_password) && password.length() >= 8 ){
                    Toast.makeText(Password_Activity.this,"valid password", Toast.LENGTH_SHORT).show();
                    Intent intent5 = new Intent(Password_Activity.this,MainActivity.class);
                    startActivity(intent5);
                }
                else{
                    Toast.makeText(Password_Activity.this,"In-valid password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
