package com.example.poojap.watch_app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class WatchDetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_detail);
        String watch = getIntent().getExtras().getString("watch");
        TextView textView = (TextView)findViewById(R.id.watch_title);
        textView.setText(watch);
        int resourceId = getIntent().getExtras().getInt("image");
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(resourceId);
        String watchDetail = getIntent().getExtras().getString("description");
        TextView textView1 = (TextView)findViewById(R.id.watch_detail);
        textView1.setText(watchDetail);
    }


}
