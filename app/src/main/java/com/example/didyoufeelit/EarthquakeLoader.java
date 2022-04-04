package com.example.didyoufeelit;

import android.content.AsyncTaskLoader;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String murl;
    public EarthquakeLoader(Context context , String url) {
        super(context);
        murl=url;
    }

    @Override
    protected void onStartLoading(){
        forceLoad();
    }
       @Override
    public List<Earthquake> loadInBackground() {
        if(murl==null){
            return null;
        }
        //fetching the earthquake data
        List<Earthquake> earthquakes=Utils.fetchEarthquakeData(murl);
        return earthquakes;
    }
}
