package com.example.aida.customlistadapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


public class ChildActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[][] data = {
                { "Galaxy Tab", "Galaxy Smart Phones", "Galaxy Gear" },
                { "iPhone", "iPad", "iPod" } };

        Intent intent = getIntent();
        int position = intent.getIntExtra("POSITION", 0);

        // Provide the cursor for the list view.
        setListAdapter(new CustomListAdapter(this, data[position]));
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        Intent intent = new Intent(parent.getContext(), ThirdActivity.class);

        // Add extended data to the intent.
        intent.putExtra("POSITION", position);

		/*
		 * Launch a new activity. You will not receive any information about when
		 * the activity exits. This implementation overrides the base version,
		 * providing information about the activity performing the launch.
		 */
        startActivity(intent);
    }

}



