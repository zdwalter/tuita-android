
    package com.tuita.app;

    import android.app.Activity;
    import android.os.Bundle;
    import com.phonegap.*;

    public class app extends DroidGap
    {
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            super.loadUrl("file:///android_asset/www/index.html");
        }
    }
    
