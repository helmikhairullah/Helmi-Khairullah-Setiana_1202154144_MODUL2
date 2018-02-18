package com.example.helmikhairullah.helmi_1202154144_modul2;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import java.util.ArrayList;

/**
 * Created by Helmi Khairullah on 18/02/2018.
 */

public class daftarmenu extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<menu> mmenu;
    private MenuAdapter mAdapter;

//    @SuppressLint("RestrictedApi")
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarmenu);
//      mangambil id recycler view dari layout
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//      set manjadi linear layout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // membuat array list objekl menu untuk menyimpan String dan image
        mmenu = new ArrayList<>();
//      membuat adapter untuk recycler view
        mAdapter = new MenuAdapter(this, mmenu);

        initializeData();
    }


    private void initializeData() {
        //Get the resources from the XML file
//        mengambil array list string
        String[] menuList = getResources().getStringArray(R.array.menu_makanan);
        String[] menuHarga = getResources().getStringArray(R.array.harga);
        String[] menuKomposisi = getResources().getStringArray(R.array.komposisinya);
        TypedArray menuImageResources = getResources().obtainTypedArray(R.array.menu_images);
        //Clear the existing data (to avoid duplication)

        mmenu.clear();

        //memasukkan String dan Image id ke Array list Menu objek

        for(int i=0; i<menuList.length; i++){
            mmenu.add(new menu(menuList[i], menuHarga[i], menuKomposisi[i],
                    menuImageResources.getResourceId(i,0)));
        }
        //Recycle the typed array
        menuImageResources.recycle();

        //notifkasi perubahan ppada adapter dan menggunakan adaptr pada recycler view
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mAdapter);
    }

}
