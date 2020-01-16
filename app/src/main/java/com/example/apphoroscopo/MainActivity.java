package com.example.apphoroscopo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botonAct1;
    CalendarView calendarView;
    TextView fecha;
    int fechaDia=0;
    int fechaMes=0;

    String resultSigno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       calendarView =(CalendarView) findViewById(R.id.calendarView);
       fecha=(TextView) findViewById(R.id.mostrarFecha);
       botonAct1=(Button) findViewById(R.id.button);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {

                fechaDia=i2;
                fechaMes=(i1+1);
                //int fechaMes=(i1+1);



            }


        });




        botonAct1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               resultSigno=darSigno(fechaDia,fechaMes);
               Intent intento=new Intent(getApplicationContext(),segundaAcitividad.class);
               resultSigno=darSigno(fechaDia,fechaMes);
               fecha.setText(resultSigno);
               intento.putExtra("resultSigno",resultSigno);
               startActivity(intento);

           }
       });







    }
    public String darSigno(int dia,int mes){

        String sig="";

        if(dia >= 20 && dia <= 31 && mes == 1 ||dia >= 1 && dia <= 18 && mes == 2 ){
            sig="Acuario.";
        }else if (dia >= 19 && dia <= 29 && mes == 2 ||dia >= 1 && dia <= 20 && mes == 3 ){
            sig="Piscis.";
        }else if (dia >= 21 && dia <= 31 && mes == 3 ||dia >= 1 && dia <= 19 && mes == 4 ){
            sig="Aries.";
        }else if (dia >= 20 && dia <= 30 && mes == 4 ||dia >= 1 && dia <= 20 && mes == 5 ) {
            sig="Tauro.";
        }else if (dia >= 21 && dia <= 31 && mes == 5 ||dia >= 1 && dia <= 20 && mes == 6 ) {
            sig="Géminis.";
        }else if (dia >= 21 && dia <= 30 && mes == 6 ||dia >= 1 && dia <= 22 && mes == 7 ) {
            sig="Cáncer.";
        }else if (dia >= 23 && dia <= 31 && mes == 7 ||dia >= 1 && dia <= 22 && mes == 8 ) {
            sig="Leo.";
        }else if (dia >= 23 && dia <= 31 && mes == 8 ||dia >= 1 && dia <= 22 && mes == 9 ) {
            sig="Virgo.";
        }else if (dia >= 23 && dia <= 30 && mes == 9 ||dia >= 1 && dia <= 22 && mes == 10 ) {
            sig="Libra.";
        }else if (dia >= 23 && dia <= 31 && mes == 10 ||dia >= 1 && dia <= 21 && mes == 11 ) {
            sig = "Escorpio.";
        }else if (dia >= 22 && dia <= 30 && mes == 11 ||dia >= 1 && dia <= 21 && mes == 12 ) {
            sig = "Sagitario.";
        }else if (dia >= 22 && dia <= 31 && mes == 12 ||dia >= 1 && dia <= 19 && mes == 1 ) {
            sig = "Capricornio.";
        }

        return sig;
    }
}
