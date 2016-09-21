package com.example.nicholas.settingsbarbats;

import android.app.Activity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.os.Bundle;

/*
*
* Code was developed in the Android.Developers way.
* https://developer.android.com/guide/topics/ui/settings.html#ReadingPrefs
*
* It excludes Reading preferences(listener) and Network usage implementaions
*
* */

public class BarbatsSettings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Display the fragment as the main content.
        getFragmentManager().beginTransaction()
            .replace(android.R.id.content, new SettingsFragment())
            .commit();

        PreferenceManager.setDefaultValues(this, R.xml.settings_main, false);
    }

    public static class SettingsFragment extends PreferenceFragment{
        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            //Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.settings_main);
        }

    }
}
