package com.example.iris.snackulator;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by Iris on 4/1/2016.
 */
public class Pop extends Activity{

    @Override
    protected void onCreate (Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);

        setContentView(R.layout.popupanswer);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.6));
    }
}
