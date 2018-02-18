package com.example.helmikhairullah.helmi_1202154144_modul2;

/**
 * Created by Helmi Khairullah on 18/02/2018.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SpinnerAdapter;

public class splashscreen extends HELMI_1202154144_MODUL2 {
    //Set waktu lama splashscreen
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(splashscreen.this, HELMI_1202154144_MODUL2.class);
                startActivity(i);

            }
            // TODO Auto-generated method stub


            //jeda selesai Splashscreen
            //finish();
        }, SPLASH_TIME_OUT);
    }
}







