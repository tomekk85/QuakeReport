package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tomas on 21.01.2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>  {


    /**resource ID for the background color for this list of words*/
    private int mColorResourceId;
    /**
     * Create a new {@link EarthquakeAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param earthquake is the list of {@link Earthquake}s to be displayed.
     */
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquake) {
        super(context, 0,earthquake);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_text_view.
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        // Get the EarthquakePlace from the currentEarthquake object and set this text on
        // the PlaceTextView.
        placeTextView.setText(currentEarthquake.getEarthquakePlace());

        // Find the TextView in the list_item.xml layout with the ID mag_text_view.
        TextView magTextView = (TextView) listItemView.findViewById(R.id.mag_text_view);
        // Get the magnitude  from the currentEarthquake object and set this text on
        // the magTextView.
        // converting EarthqaukeMag from double into String
        magTextView.setText( String.valueOf(currentEarthquake.getEarthquakeMag()));

        // Find the TextView in the list_item.xml layout with the ID date_text_view.
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        // Get the date  from the currentEarthquake object and set this text on
        // the dateTextView.
        // converting EarthqaukeDate from Date into String
        dateTextView.setText( String.valueOf(currentEarthquake.getEarthquakeDate()));

        return listItemView;
    }
}
