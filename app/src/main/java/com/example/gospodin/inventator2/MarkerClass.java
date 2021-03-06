package com.example.gospodin.inventator2;

import android.location.Location;

enum Type {Sport, Culture, Party, Food}


public class MarkerClass {
    private double lat, lng;
    private String title="", description="";


    public MarkerClass(Double lat, Double lng, String title, String description){
        this.lat = lat;
        this.lng = lng;
        this.title = title;
        this.description = description;
    }

    public double getLat(){
        return lat;
    }

    public double getLng(){
        return lng;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float distance(double a1, double a2, double b1, double b2){
        float[] result = new float[1];
        Location.distanceBetween(a1, a2, b1, b2, result);

        return result[0];
    }
}
