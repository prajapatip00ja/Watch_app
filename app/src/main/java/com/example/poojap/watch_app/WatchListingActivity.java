package com.example.poojap.watch_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.AdapterView;
import android.widget.GridView;
import android.view.View;

import adapters.WatchListAdapter;


public class WatchListingActivity extends Activity {
    private String[] watches = new String[]{"p1","p2","p3","p4","p5"};
    private int[] images;
    private String[] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_listing);
        GridView gridView = (GridView) findViewById(R.id.grid_view);
        WatchListAdapter watchListAdapter = new WatchListAdapter(this, watches);
        gridView.setAdapter(watchListAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int position,long id){
                Intent intent = new Intent(getApplicationContext(),WatchDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("watch", watches[position]);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
