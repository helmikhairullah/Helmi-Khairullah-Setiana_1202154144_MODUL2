package com.example.helmikhairullah.helmi_1202154144_modul2;

/**
 * Created by Helmi Khairullah on 18/02/2018.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

// implement untuk mengimplement spinner pada layout
public class dinein extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    private Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinein);

        Intent x = getIntent();
        Toast.makeText(this, x.getStringExtra("toast"), Toast.LENGTH_SHORT).show();

//        mangambil idspinner
        spinner = (Spinner) findViewById(R.id.pilihmeja);

//        mengambil nilai pada spinner
        if (spinner != null) {spinner.setOnItemSelectedListener(this);}
        // membuat adapter untuk spinner dengan string array label meja
        adapter = ArrayAdapter.createFromResource(this,
                R.array.nomor_meja, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // menggunakan adapater pada spinner
        if (spinner != null) spinner.setAdapter(adapter);

    }

    public void milihpesanan (View view) {
//      membuka menu makan malam
        Intent intent = new Intent(this, daftarmenu.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
