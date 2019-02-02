package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        EditText numEditText = findViewById(R.id.numEditText);
        Double dollarAmountDouble = Double.parseDouble(numEditText.getText().toString());
        Double poundAmount = dollarAmountDouble * 0.76;
        
        //show amount
        Toast.makeText(this, "#" + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount",numEditText.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
