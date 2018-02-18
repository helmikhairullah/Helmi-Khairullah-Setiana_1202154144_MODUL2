package com.example.helmikhairullah.helmi_1202154144_modul2;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Helmi Khairullah on 18/02/2018.
 */

public class penjelasanmenu  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penjelasanmenu);

//        mengaambil id layout .
        TextView namaMenu = (TextView) findViewById(R.id.namanya);
        TextView hargamenu = (TextView) findViewById(R.id.hargaMenu);
        TextView komposisi = (TextView) findViewById(R.id.komposisinya);
        ImageView Imagemenu = (ImageView) findViewById(R.id.menuImage);

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.GRAY);
        gradientDrawable.setSize(100,100);

//        set layout dengan id
        namaMenu.setText(getIntent().getStringExtra("menu_makanan"));
        hargamenu.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisinya"));
//        Glide.with(this).load(getIntent().getIntExtra("menu_image",0))
//                .placeholder(gradientDrawable).into(Imagemenu);


    }

}
