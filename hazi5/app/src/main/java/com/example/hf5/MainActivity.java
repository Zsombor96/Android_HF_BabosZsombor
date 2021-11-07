package com.example.hf5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] countyArray = {"Cluj", "Harghita", "Bacau", "Brasov", "Mures", "Covasna"};

    List<String> list = new ArrayList<String>(Arrays.asList(countyArray));
    ArrayAdapter adapter;
    public ListView listView;

    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_YELLOW = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView = findViewById(R.id.listviewID);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.listviewID:
                menu.add(0, MENU_COLOR_RED, 0, "Red");
                menu.add(0, MENU_COLOR_GREEN, 0, "Green");
                menu.add(0, MENU_COLOR_YELLOW, 0, "Yellow");
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_COLOR_RED:
                break;
            case MENU_COLOR_GREEN:
                break;
            case MENU_COLOR_YELLOW:
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()) {
            case R.id.sort:
                Collections.sort(list);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.delete:
                list.removeAll(list);
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}