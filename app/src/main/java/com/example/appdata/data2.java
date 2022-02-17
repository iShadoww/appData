package com.example.appdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class data2 extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);

        tv1 = (TextView) findViewById(R.id.tv1);
        String data = getIntent().getStringExtra("data");

        tv1.setText("Data:" + data);
    }

    //Metodo boton regresar
    public void Regresar(View view){
        Intent regresarr = new Intent(this, MainActivity.class);
        startActivity(regresarr);

    }


}