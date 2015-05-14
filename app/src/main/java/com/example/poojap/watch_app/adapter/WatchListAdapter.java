package com.example.poojap.watch_app.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poojap.watch_app.R;

/**
 * Created by poojap on 13/05/15.
 */
public class WatchListAdapter extends ArrayAdapter {
    private LayoutInflater inflater;
    private String[] wathes;
    private int[] images;
    private String[] description;


    public WatchListAdapter(Activity activity, String[] watches, int[] images,String[] description) {
        super(activity,0,watches);
        inflater = activity.getWindow().getLayoutInflater();
        this.images = images;
        this.wathes = watches;
        this.description = description;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        if(row==null) {
            row = inflater.inflate(R.layout.watch_row, parent, false);
        }
        TextView tv = (TextView) row.findViewById(R.id.src_text);
        tv.setText(wathes[position]);
        ImageView iv = (ImageView)row.findViewById(R.id.image_container);
        iv.setImageResource(images[position]);
        return row;
    }



}
