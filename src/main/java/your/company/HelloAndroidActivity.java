package your.company;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class HelloAndroidActivity extends DroidGap {

    private static String TAG = "cordova-primer-app";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

}

