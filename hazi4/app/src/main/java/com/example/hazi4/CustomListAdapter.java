package com.example.hazi4;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;

    private final Integer[] imageIDarray;

    private final String[] nameArray;

    private final String[] infoArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam){

        super(context, R.layout.listview_row, nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row,null,true);

        TextView szoveg1 = rowView.findViewById(R.id.szoveg1);
        TextView szoveg2 = rowView.findViewById(R.id.szoveg2);
        ImageView kep = rowView.findViewById(R.id.kep);

        szoveg1.setText(nameArray[position]);
        szoveg2.setText(infoArray[position]);
        kep.setImageResource(imageIDarray[position]);

        return rowView;

    }


}

