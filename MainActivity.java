package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.function.DoubleToIntFunction;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        //dollar to Euros conversion
        EditText numEditText = findViewById(R.id.numEditText);
        Double dollarAmountDouble = Double.parseDouble(numEditText.getText().toString());
        Double poundAmount = dollarAmountDouble * 0.87;


        //show amount for pounds
        Toast.makeText(this, "#" + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();
        Log.i("amount",numEditText.getText().toString());

    }

    public void convertPesosFunction(View view){

        EditText num2EditText = findViewById(R.id.num2EditText);
        Double dollarAmountDouble2 = Double.parseDouble(num2EditText.getText().toString());
        Double pesosAmount = dollarAmountDouble2 * 19.10;

        //show amount for Pesos
        Toast.makeText(this, "$" + String.format("%.2f", pesosAmount), Toast.LENGTH_SHORT).show();
        Log.i("amount", num2EditText.getText().toString());
    }

    public void bitcoinConvertFunction(View view){

        EditText bitcoinEditText = findViewById(R.id.bitcoinEditText);
        Double dollarAmountDouble3 = Double.parseDouble(bitcoinEditText.getText().toString());
        Double bitcoinAmount = dollarAmountDouble3 * 0.058;

        //show amount for Bitcoin
        Toast.makeText(this,"$" + String.format("%.2f", bitcoinAmount), Toast.LENGTH_SHORT).show();
        Log.i("amount", bitcoinEditText.getText().toString());
    }


    public void yenConvertFunction(View view){

        EditText yenEditText = findViewById(R.id.yenEditText);
        Double dollarAmountDouble4 = Double.parseDouble(yenEditText.getText().toString());
        Double yenAmount = dollarAmountDouble4 * 109.96;

        //Show amount as Toast for Yen
        Toast.makeText(this, "$" + String.format("%.2f", yenAmount), Toast.LENGTH_SHORT).show();
        Log.i("amount", yenEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
