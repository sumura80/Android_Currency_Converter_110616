package com.example.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view){

        EditText dollarField = (EditText) findViewById(R.id.dollarField);

        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
        Double dollaryenAmount = dollarAmount * 0.97;
        Toast.makeText(getApplicationContext(), dollaryenAmount.toString() + "ドルです", Toast.LENGTH_LONG).show();


    }

    public void convert2 (View view){

        EditText yenField = (EditText) findViewById(R.id.yenField);

        Double yenAmount = Double.parseDouble(yenField.getText().toString());
        Double usdAmount = yenAmount * 1.03;
        Toast.makeText(getApplicationContext(), usdAmount.toString() + "円です", Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
