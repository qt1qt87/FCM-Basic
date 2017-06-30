package com.example.rg.fcmtest;

import android.util.Log;

/**
 * Created by RG on 2017-06-30.
 */

public class Logger {
    public static void log(String str) {
        if(str == null){
            str = "null";
        }
        Log.i("RG_LOG", str);
    }
}
