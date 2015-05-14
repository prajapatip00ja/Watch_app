package com.example.poojap.watch_app;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.poojap.watch_app.adapter.WatchListAdapter;


public class WatchListingActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_listing);
        WatchListAdapter watchListAdapter = new WatchListAdapter(this, new String[7]);
        ListView listView = (ListView) findViewById(R.id.list_of_watch);
        listView.setAdapter(watchListAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView,View view ,int position,long id){
        Intent intent = new Intent(this,ShowDescriptionActivity.class);
        startActivity(intent);
    }

}
