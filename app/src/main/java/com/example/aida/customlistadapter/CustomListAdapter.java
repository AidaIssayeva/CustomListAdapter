package com.example.aida.customlistadapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;


    public CustomListAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout, values);
        this.context = context;
        this.values = values;

    }

    @Override
    // Get a View that displays the data at the specified position in the data set.
    public View getView(int position, View convertView, ViewGroup parent) {

		/*
		 * Instantiates a layout XML file into its corresponding View objects.
		 * It is never used directly. Instead, use getSystemService(String) to
		 * retrieve a standard LayoutInflater instance that is already hooked up to
		 * the current context and correctly configured for the device you are running on.
		 */
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		/*
		 * Inflate a new view hierarchy from the specified xml resource.
		 * Throws InflateException if there is an error.
		 */
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.txtStatus);
        textView.setText(values[position]);

        return rowView;
    }
}