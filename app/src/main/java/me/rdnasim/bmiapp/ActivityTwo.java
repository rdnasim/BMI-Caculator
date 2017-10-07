package me.rdnasim.bmiapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    EditText weightText;
    EditText heightText;
    Button calculateButton;
    TextView yourBIM;
    TextView yourResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void CalculateBMI(View view) {

        double weight = 0;
        double height = 0;
        double bmi = 0;
        String msg = "";

        weightText = (EditText) findViewById(R.id.weight_kg);
        heightText = (EditText) findViewById(R.id.height_m);

        calculateButton = (Button) findViewById(R.id.calculate_bim_BTN);

        yourBIM = (TextView) findViewById(R.id.your_bim);
        yourResult = (TextView) findViewById(R.id.your_result);

        weight = Double.parseDouble(weightText.getText().toString());
        height = Double.parseDouble(heightText.getText().toString());

        bmi = height * height;
        bmi = weight / bmi;

        yourBIM.setText(String.valueOf(bmi));

        if (bmi < 18.5) {
            msg = "UnderWeight";
        } else if (bmi > 18.5 && bmi < 24.9) {
            msg = "Normal Weight";
        } else if (bmi > 25 && bmi < 29.9) {
            msg = "OverWeight";
        }
        else if (bmi>30){
            msg = "Obesity";
        }

        yourResult.setText(msg);

    }
}
