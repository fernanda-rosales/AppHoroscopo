package com.example.apphoroscopo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundaAcitividad extends AppCompatActivity {


    String mensaje;
    private TextView tv_signo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_acitividad);

        tv_signo=(TextView) findViewById(R.id.etiquetaResulAct2);

        mensaje=getIntent().getStringExtra("resultSigno");
        tv_signo.setText("Tu signo es:\n"+mensaje);




    }
}
