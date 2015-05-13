package com.example.poojap.watch_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.poojap.watch_app.adapter.WatchListAdapter;


public class WatchListingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_listing);
        WatchListAdapter watchListAdapter = new WatchListAdapter(this,new String[7]);
        ListView listView = (ListView) findViewById(R.id.list_of_watch);
        listView.setAdapter(watchListAdapter);
        Log.d("activity","create");

    }

    public void goToSecondPage(View view){
        Intent intent = new Intent(this,secondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("activity", "start");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("activity", "restart");
    }

    @Override
    protected void onResume(){
        super.onRestart();
        Log.d("activity", "resume");
    }

    @Override
    protected void onStop(){
        super.onRestart();
        Log.d("activity", "stop");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("activity","pause");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("activity","destroy");
    }





}
