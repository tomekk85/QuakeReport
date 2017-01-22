package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by tomas on 21.01.2017.
 */

public class Earthquake {

    /** Location of earthquake */
    private String mEarthquakePlace;

    /** magnitude of earthquake */
    private double  mEarthquakeMag;

    /** Image resource ID for the word */
    private Date mEarthquakeDate;
    /**
     * Create a new Word object.
     *
     * @param earthquakePlace is name of location that earthqauke took place
     * @param earthquakeMag magnitude of earthquake
     * @param earthquakeDate is date when  earthquake took place    */

    public Earthquake(String earthquakePlace, double earthquakeMag, Date earthquakeDate) {
        mEarthquakePlace = earthquakePlace;
        mEarthquakeMag = earthquakeMag;
        mEarthquakeDate =  earthquakeDate;
    }



    /**
     * Get the place of earthqauke.
     */
    public String getEarthquakePlace() {
        return mEarthquakePlace;
    }

    /**
     * Get the earthqauke magnitude.
     */
    public double getEarthquakeMag() {
        return mEarthquakeMag;
    }

    /**
     * Get the date of earthqauke.
     */
    public Date getEarthquakeDate() {
        return mEarthquakeDate;
    }

}
