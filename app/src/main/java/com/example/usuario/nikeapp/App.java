package com.example.usuario.nikeapp;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by USUARIO on 12/09/2018.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/NewsGothicStd.otf")
                .setFontAttrId(R.attr.fontPath).build());
    }
}
