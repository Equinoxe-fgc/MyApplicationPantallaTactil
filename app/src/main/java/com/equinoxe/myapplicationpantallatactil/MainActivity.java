package com.equinoxe.myapplicationpantallatactil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView entrada = (TextView)findViewById(R.id.textViewEntrada);
        entrada.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        TextView salida = (TextView)findViewById(R.id.textViewSalida);
        salida.append(motionEvent.toString() + "\n");

        return true;
    }
}
