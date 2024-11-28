package com.example.login_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Forgot_Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_2);

        EditText forgot1 = findViewById(R.id.forgot_act1);
        EditText forgot2 = findViewById(R.id.forgot_act2);
        Button verify = findViewById(R.id.forgot_button);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e_mail      = forgot1.getText().toString();
                String re_e_mail   = forgot2.getText().toString();

                if(!e_mail.isEmpty()){
                    forgot1.setText(e_mail);
                }
                if(!re_e_mail.isEmpty()){
                    forgot2.setText(re_e_mail);
                }

                if(e_mail.equals(re_e_mail)){
                    Toast.makeText(Forgot_Activity.this,"valid e-mail", Toast.LENGTH_SHORT).show();
                    Intent intent4 = new Intent(Forgot_Activity.this,Password_Activity.class);
                    startActivity(intent4);
                }else{
                    Toast.makeText(Forgot_Activity.this,"In-valid e-mail",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}