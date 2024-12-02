package com.example.login_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class Gen_Dob_Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.gen_dob);

        EditText dob1 = findViewById(R.id.dob1);
        EditText dob2 = findViewById(R.id.dob2);
        EditText dob3 = findViewById(R.id.dob3);
        Button button = findViewById(R.id.button_dob);
        RadioGroup radioGroup = findViewById(R.id.radio_grp);
        Button button1 = findViewById(R.id.button_gen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day1   = dob1.getText().toString();
                String month1 = dob2.getText().toString();
                String year1  = dob3.getText().toString();

                if(day1.isEmpty() || month1.isEmpty() || year1.isEmpty()){
                    Toast.makeText(Gen_Dob_Activity.this,"Nothing Entered",Toast.LENGTH_SHORT).show();
                }else{
                    int day = Integer.parseInt(day1);
                    int month = Integer.parseInt(month1);
                    int year = Integer.parseInt(year1);

                    if(day<1 || day>31){
                        Toast.makeText(Gen_Dob_Activity.this,"In-valid Day",Toast.LENGTH_SHORT).show();
                    } else if (month<1 || month>12) {
                        Toast.makeText(Gen_Dob_Activity.this,"In-valid Month",Toast.LENGTH_SHORT).show();
                    } else if (year < 1920 || year > Calendar.getInstance().get(Calendar.YEAR)) {
                        Toast.makeText(Gen_Dob_Activity.this,"In-valid year",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Gen_Dob_Activity.this,"Your Dob "+day+"/"+month+"/"+year+" is verified",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int selectedButton = radioGroup.getCheckedRadioButtonId();
        if(selectedButton !=-1){
            RadioButton selectedRb = findViewById(selectedButton);
            String selectedGen = selectedRb.getText().toString();
            Toast.makeText(Gen_Dob_Activity.this,"You Choose "+selectedGen,Toast.LENGTH_SHORT).show();

            Toast.makeText(Gen_Dob_Activity.this,"Loading next page",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(Gen_Dob_Activity.this,"No Selection",Toast.LENGTH_SHORT).show();
        }
    }

});

    }
}