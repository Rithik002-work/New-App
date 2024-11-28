package com.example.login_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText text1 = findViewById(R.id.text1);
        EditText text2 = findViewById(R.id.text2);
        Button button = findViewById(R.id.button1);
        Button button1 = findViewById(R.id.button2);
        TextView text = findViewById(R.id.forgot);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = text1.getText().toString();
                String pass = text2.getText().toString();
                if (!user.isEmpty()) {
                    text1.setText(user);
                }
                if (!pass.isEmpty()) {
                    if (pass.length() <= 8) {
                        text2.setText(pass);
                    } else {
                        Toast.makeText(MainActivity.this, "Passwords should be 8 characters", Toast.LENGTH_LONG).show();
                    }
                }

                if (!user.isEmpty() && !pass.isEmpty() && pass.length() <= 8) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Enter valid Details", Toast.LENGTH_LONG).show();

                }

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Loading Sign In Page!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Signup_Activity.class);
                startActivity(intent);
            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Loading forgot password/username page!", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, Forgot_Activity.class);
                startActivity(intent1);

            }
        });

    }
}
