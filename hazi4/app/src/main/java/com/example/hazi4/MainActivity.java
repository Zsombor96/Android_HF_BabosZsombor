package com.example.hazi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hazi4.CustomListAdapter;
import com.example.hazi4.DetailActivity;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR","USD","GBP","AUD",
            "CAD","RON","JPY","HUF" };

    String[] infoArray = {
            "Euro",
            "US dollar",
            "UK font",
            "AUS dollar",
            "Canadian dollar",
            "Romanian ron",
            "Japan yen",
            "Hungarian forint"
    };

    Integer[] imageArray = {
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter valami = new CustomListAdapter(this,nameArray,infoArray,imageArray);
        listView = findViewById(R.id.listviewID);
        listView.setAdapter(valami);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"asdasd",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                String message=nameArray[position];
                intent.putExtra("animal",message);

                startActivity(intent);
            }
        });
    }
}