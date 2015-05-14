package com.example.poojap.watch_app;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;

import android.widget.ListView;
import android.widget.TextView;

import com.example.poojap.watch_app.adapter.WatchListAdapter;


public class WatchListingActivity extends ListActivity {
    private String[] wathes;
    private int[] images;
    private String[] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_listing);
        this.wathes = getResources().getStringArray(R.array.watch_array);
        this.images = new int[]{R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1};
        this.description = getResources().getStringArray(R.array.description_array);
        WatchListAdapter watchListAdapter = new WatchListAdapter(this,wathes,images,description);
        setListAdapter(watchListAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
       Intent intent = new Intent(this,WatchDetailActivity.class);
       this.wathes = getResources().getStringArray(R.array.watch_array);
       this.images = new int[]{R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1};
       this.description = getResources().getStringArray(R.array.description_array);

       Bundle bundle = new Bundle();
       bundle.putString("watch",wathes[position]);
       bundle.putInt("image",images[position]);
       bundle.putString("description",description[position]);
       intent.putExtras(bundle);
       startActivity(intent);
    }
}
