package com.example.aida.customlistadapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class ThirdActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [][] data = {
                {"The Samsung Galaxy Tab is a line of upper mid-range Android-based tablet computers produced by Samsung."},
                {"Samsung Galaxy (stylized as Samsung GALAXY or SAMSUNG Galaxy) is a series of Android-powered mobile computing devices designed, manufactured and marketed by Samsung Electronics"},
                        {"The Samsung Galaxy Gear is a smartwatch produced by Samsung Electronics in the Samsung Gear family of devices."},
                {"iPhone  is a line of smartphones designed and marketed by Apple Inc. They run Apple's iOS mobile operating system."},
                        { "iPad (/ˈaɪpæd/ eye-pad) is an iOS-based line of tablet computers designed and marketed by Apple Inc."},
                                {"The iPod is a line of portable media players and multi-purpose pocket computers designed and marketed by Apple Inc."},
        };
        Intent intent = getIntent();
        int position = intent.getIntExtra("POSITION", 0);
        setListAdapter(new CustomListAdapter(this, data[position]));

    }
}
