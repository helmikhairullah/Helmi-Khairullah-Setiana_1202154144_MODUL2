package com.example.helmikhairullah.helmi_1202154144_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by Helmi Khairullah on 18/02/2018.
 */

public class menu {
    private final String namaMenu;
    private final String hargaMenu;
    private final String komposisi;
    private final int imageMenu;


    public menu (String nama, String hargaMenu, String komposisi,int imageMenu) {
        this.namaMenu = nama;
        this.hargaMenu = hargaMenu;
        this.imageMenu = imageMenu;
        this.komposisi = komposisi;
    }

    String getNama(){
        return namaMenu;
    }
    String getHargaMenu(){
        return hargaMenu;
    }
    String getKomposisi(){return komposisi;}
    int getImageMenu(){ return imageMenu;}

    // method untuk menjalankan aktivitas yang memuncuklkan detail menu.
    static Intent starter(Context context, String namaMenu, String hargaMenu,
                          String komposisi, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, penjelasanmenu.class);
        detailIntent.putExtra("nama", namaMenu);
        detailIntent.putExtra("harga", hargaMenu);
        detailIntent.putExtra("komposisi", komposisi);
        detailIntent.putExtra("image", imageResId);
        return detailIntent;
    }
}
