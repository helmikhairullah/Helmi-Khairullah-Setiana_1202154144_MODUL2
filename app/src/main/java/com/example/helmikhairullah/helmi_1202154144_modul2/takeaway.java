package com.example.helmikhairullah.helmi_1202154144_modul2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helmikhairullah.helmi_1202154144_modul2.timepicker;

/**
 * Created by Helmi Khairullah on 18/02/2018.
 */

public class takeaway extends AppCompatActivity {

    private EditText buka;
    private EditText tutup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.takeaway);
        buka = (EditText) findViewById(R.id.waktu);
        tutup = (EditText) findViewById(R.id.tanggal);

        Intent i = getIntent();
        Toast.makeText(getApplicationContext() , i.getStringExtra("toast"), Toast.LENGTH_SHORT).show();

        //menunjukkan fragmen saat edittext di klik.
        buka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTimePickerDialog(view);
            }
        });
        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog(view);
            }
        });
    }

    //    2 method dibawah untuk membuka fragmen dan mendapatkan tanggal dari fragmen
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new datepicker();
        newFragment.show(getSupportFragmentManager(),"date Picker");
    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        // Assign the concatenated strings to dateMessage.
        String dateMessage = (month_string + "/" +
                day_string + "/" + year_string);
        tutup.setText(dateMessage);
    }

    //    2 method dibawah untuk membuka fragmen dan mendapatkan waktu dari fragmen
    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new timepicker();
        newFragment.show(getSupportFragmentManager(),"time picker");
    }
    public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.
        String timeMessage = (hour_string + ":" + minute_string);
        buka.setText(timeMessage);
    }

    //membuka aktivitas pilih Menu makan malam
    public void pilihPesanan (View view) {
        Intent intent = new Intent(this, daftarmenu.class);
        startActivity(intent);
    }

}
