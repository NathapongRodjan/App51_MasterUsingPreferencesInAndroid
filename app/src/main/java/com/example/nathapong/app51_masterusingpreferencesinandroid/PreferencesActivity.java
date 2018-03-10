package com.example.nathapong.app51_masterusingpreferencesinandroid;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

/**
 * Created by Nathapong on 15/2/2561.
 */

public class PreferencesActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferrence_file);

    }
}
