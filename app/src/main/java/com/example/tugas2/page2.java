package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView txtdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        txtdata = (TextView) findViewById(R.id.txtdata);
        Intent datas = getIntent();
        String npm = datas.getStringExtra("data");
        String nama = datas.getStringExtra("datax");
        txtdata.setText(nama + "\n" + npm);


    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(page2.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
