package com.example.hf_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameList = {
            "EUR",
            "USD",
            "GPB",
            "AUD",
            "CAD",
            "CHF",
            "DKK",
            "HUF"
    };
    String[] infoList = {
            "Euro",
            "Amerikai dollár",
            "Angol font",
            "Ausztráliai dollár",
            "Kanadai dollár",
            "Svájci frank",
            "Dán korona",
            "Magyar forint"
    };
    Integer[] imageList = {
            R.drawable.euro,
            R.drawable.usa,
            R.drawable.uk,
            R.drawable.australia,
            R.drawable.canada,
            R.drawable.switzerland,
            R.drawable.denmark,
            R.drawable.hungary
    };
    String[] sellList = {
            "4,5300",
            "3,9400",
            "6,3600",
            "3,0700",
            "3,3000",
            "4,3200",
            "0,6050",
            "0,0138"
    };
    String[] buyList = {
            "4,4200",
            "3,9800",
            "6,1200",
            "2,9600",
            "3,0950",
            "4,2200",
            "0,5700",
            "0,0128"
    };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter customListAdapter = new CustomListAdapter(this, imageList, nameList, infoList, buyList, sellList);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(customListAdapter);
    }
}