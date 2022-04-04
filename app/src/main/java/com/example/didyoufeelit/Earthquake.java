package com.example.didyoufeelit;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDate;
    private String murl;
    public Earthquake(double Magnitude , String Location , long Date){
        mMagnitude=Magnitude;
        mLocation=Location;
        mDate=Date;
    }
    public Earthquake(double Magnitude , String Location , long Date , String url){
        mMagnitude=Magnitude;
        mLocation=Location;
        mDate=Date;
        murl=url;
    }

    public double getmMagnitude(){
        return mMagnitude;
    }
    public String getmLocation(){
        return mLocation;
    }
    public String getUrl(){
        return murl;
    }
    public long getmDate(){
        return mDate;
    }

}
