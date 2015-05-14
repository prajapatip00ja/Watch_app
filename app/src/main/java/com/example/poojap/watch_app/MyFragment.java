package com.example.poojap.watch_app;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by saylik on 14/05/15.
 */
public class MyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,Bundle savedInstanceState){
        Log.d("Log", "in onCreateView methods");
        return layoutInflater.inflate(R.layout.my_fragment_layout,container,false);
    }

}
