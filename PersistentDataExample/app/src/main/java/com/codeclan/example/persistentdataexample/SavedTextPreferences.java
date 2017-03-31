package com.codeclan.example.persistentdataexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by user on 19/01/2017.
 */

public class SavedTextPreferences {
    private static final String PREF_SAVEDTEXT = "savedText";

    public static  void setStoredText(Context context, String text) {
        PreferenceManager.getDefaultSharedPreferences(context)
        .edit()
        .putString(PREF_SAVEDTEXT, text)
        .apply();
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
//        SharedPreferences.Editor editor = prefs.edit();
//        editor.putString(PREF_SAVEDTEXT, text);
//        editor.apply();
    }
    public static String getStoredText(Context context){
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
//        return prefs.getString(PREF_SAVEDTEXT, null);
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_SAVEDTEXT,null);
    }
}
