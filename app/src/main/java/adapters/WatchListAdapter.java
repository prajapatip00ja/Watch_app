package adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poojap.watch_app.R;

import java.lang.reflect.Array;


public class WatchListAdapter extends ArrayAdapter {
    private LayoutInflater inflater;
    private String[] wathes;
    private int[] images;
    private String[] description;


    public WatchListAdapter(Activity activity, String[] wathes) {
        super(activity,0,wathes);
        this.wathes=wathes;
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
        return row;
    }



}
