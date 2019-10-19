package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtnpm;
    EditText edtnama;
    Button btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnpm =(EditText) findViewById(R.id.edtnpm);
        edtnama =(EditText) findViewById(R.id.edtnama);
        btnsave =(Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = edtnpm.getText().toString();
                String datax = edtnama.getText().toString();

                Intent next = new Intent(MainActivity.this,page2.class);
                next.putExtra("data",data);
                next.putExtra("datax",datax);
                startActivity(next);
                finish();



            }
        });
    }
}
