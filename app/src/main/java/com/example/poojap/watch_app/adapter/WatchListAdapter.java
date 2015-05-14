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
    String[] wathes = getContext().getResources().getStringArray(R.array.watch_array);
    int[] images = new int[]{R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1};


    public WatchListAdapter(Activity activity, Object[] objects) {
        super(activity,0,objects);
        inflater = activity.getWindow().getLayoutInflater();
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
