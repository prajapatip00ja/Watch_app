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
        Bundle bundle = getIntent().getExtras();
        String watch = bundle.getString("watch");
        TextView tv = (TextView)findViewById(R.id.src_text);
        tv.setText(watch);
//        int i = intent.getIntExtra("image",0);
//        ImageView iv = (ImageView)findViewById(R.id.imageView);
//        iv.setImageResource(i);
    }


}
