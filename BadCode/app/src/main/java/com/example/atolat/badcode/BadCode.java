package com.example.atolat.badcode;

import android.content.Context;
import android.content.Intent;

public class BadCode {
    public Intent getIntent(String componentType){
        Intent i = new Intent("org.runnerup.GPSStartIntent");
        return i;
    }
    public void startComponentExplicit(Context context, String componentType, Intent intent){
        //you can use the Context to start a component with the given Intent

    }
    public void startComponentImplicit(Context context, String componentType, String action){
        //you can use the Context to start a component with the given action
        //make sure to create an Intent from that action

    }

}