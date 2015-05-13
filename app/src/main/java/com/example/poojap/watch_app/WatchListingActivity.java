package com.example.poojap.watch_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.poojap.watch_app.adapter.WatchListAdapter;


public class WatchListingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_listing);
        WatchListAdapter watchListAdapter = new WatchListAdapter(this,new String[7]);
        ListView listView = (ListView) findViewById(R.id.list_of_watch);
        listView.setAdapter(watchListAdapter);
    }



}
