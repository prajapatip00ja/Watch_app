package com.example.poojap.watch_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class WatchListingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_listing);
        String[] watches = new String[]{"fastrack","sonata","titan"};
        ArrayAdapter watchListAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,watches);
        ListView listView = (ListView) findViewById(R.id.list_of_watch);
        listView.setAdapter(watchListAdapter);
    }



}
