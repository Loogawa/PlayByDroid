package com.loogawa.playbydroid;

import android.app.Application;
import com.parse.Parse;

/**
 * Created by Mark on 5/30/2015.
 */
public class PlayByDroidApplication extends Application {
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "onhbTBrXJqfr47HhQZYbgbCd1hORiaSxHAXvAevs", "YBrgwBbko4Ub8fiWusN3Kv7JiBHgjqT5QbpFPIay");
    }


}
