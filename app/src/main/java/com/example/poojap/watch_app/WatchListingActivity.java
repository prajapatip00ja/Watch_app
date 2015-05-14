package com.example.poojap.watch_app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.poojap.watch_app.adapter.WatchListAdapter;


public class WatchListingActivity extends ListActivity {
    private String[] wathes;
    int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_listing);
        this.wathes = getResources().getStringArray(R.array.watch_array);
        this.images = new int[]{R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1};

        WatchListAdapter watchListAdapter = new WatchListAdapter(this,wathes,images);
        setListAdapter(watchListAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
       Intent intent = new Intent(this,WatchDetailActivity.class);
       this.wathes = getResources().getStringArray(R.array.watch_array);
       this.images = new int[]{R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1,R.drawable.watch1};
        Log.d("watch",wathes[position]);
        Bundle bundle = new Bundle();
       bundle.putString("watch",wathes[position]);
       intent.putExtras(bundle);
       startActivity(intent);
    }
}
