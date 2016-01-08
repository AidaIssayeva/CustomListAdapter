package com.example.aida.customlistadapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends ListActivity implements OnItemClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] data = { "Samsung", "Apple" };


        // Provide the cursor for the list view.
        setListAdapter(new CustomListAdapter(this, data));

		/* setOnItemClickListener() Register a callback to be invoked when an item
		 * in this AdapterView has been clicked.
		 */
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        Intent intent = new Intent(parent.getContext(), ChildActivity.class);

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
