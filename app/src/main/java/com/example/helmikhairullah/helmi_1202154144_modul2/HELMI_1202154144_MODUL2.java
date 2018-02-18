package com.example.helmikhairullah.helmi_1202154144_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class HELMI_1202154144_MODUL2 extends AppCompatActivity {
    RadioGroup asik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helmi_1202154144__modul2);

       asik = (RadioGroup) findViewById(R.id.asik);
    }

    public void pesansekarang (View view) {
        Intent intent;
//      mengecek radio radio button yang mana yang dipilih
       int pilihJenis = asik.getCheckedRadioButtonId();

        switch (pilihJenis){

//            apabila dine in akan ke aktiivtas Dine In
            case R.id.radioDineIn:
                intent = new Intent(this, dinein.class);
                intent.putExtra("toast", "sudah memilih menu");
                startActivity(intent);
                break;

//            sebaliknya apabvila Take away akan ke Aktivitas DIne.
            case R.id.radioTakeAway:
                intent = new Intent(this, takeaway.class);
                intent.putExtra("toast", "Jenis Pesanan Take Away");
                startActivity(intent);
                break;
        }
    }
    }

