package com.example.hf_3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;

    private final Integer[] imageIDList;

    private final String[] countryCurrency;

    private final String[] currencyDescription;

    private final String[] sell;

    private final String[] buy;

    public CustomListAdapter(Activity context, Integer[] imageIDList, String[] countryCurrency, String[] currencyDescription, String[] sell, String[] buy) {

        super(context, R.layout.listview_row, countryCurrency);

        this.context = context;
        this.imageIDList = imageIDList;
        this.countryCurrency = countryCurrency;
        this.currencyDescription = currencyDescription;
        this.sell = sell;
        this.buy = buy;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();


        View rowWiew = inflater.inflate(R.layout.listview_row,null,true);

        ImageView image = (ImageView) rowWiew.findViewById(R.id.imageView);
        TextView countryCurrency1 = (TextView) rowWiew.findViewById(R.id.textView);
        TextView currencyDescription1 = (TextView) rowWiew.findViewById(R.id.textView2);
        TextView selling1 = (TextView) rowWiew.findViewById(R.id.textView4);
        TextView buying1 = (TextView) rowWiew.findViewById(R.id.textView5);

        image.setImageResource(imageIDList[position]);
        countryCurrency1.setText(countryCurrency[position]);
        currencyDescription1.setText(currencyDescription[position]);
        selling1.setText(sell[position]);
        buying1.setText(buy[position]);

        return rowWiew;

    }

}