package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnossz = (Button) findViewById(R.id.buttonossz);
        Button btnkiv = (Button) findViewById(R.id.buttonkiv);
        Button btnoszt = (Button) findViewById(R.id.buttonoszt);
        Button btnszor = (Button) findViewById(R.id.buttonszor);
        final EditText etv = (EditText) findViewById(R.id.editText1);
        final EditText etv2 = (EditText) findViewById(R.id.editText2);
        final TextView result = (TextView) findViewById(R.id.textView1);

        btnossz.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int ossz = x + y;
                result.setText("Eredmeny " + x + " + " + y + " = " + ossz);
            }
        });

        btnkiv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int kiv = x - y;
                result.setText("Eredmeny " + x + " - " + y + " = " + kiv);
            }
        });

        btnoszt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int oszt = x / y;
                result.setText("Eredmeny " + x + " / " + y + " = " + oszt);
            }
        });

        btnszor.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int szor = x * y;
                result.setText("Eredmeny " + x + " * " + y + " = " + szor);
            }
        });
    }

}