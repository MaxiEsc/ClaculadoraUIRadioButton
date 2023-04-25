package com.maxescobar.calculadoraradiobuttonui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumeroA, etNumeroB;
    private TextView tvResultado;
    private RadioButton rbSumar, rbRestar, rbMultiplicar, rbDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumeroA = (EditText) findViewById(R.id.numeroA);
        etNumeroB = (EditText) findViewById(R.id.numeroB);
        tvResultado = (TextView) findViewById(R.id.txResultado);
        rbSumar = (RadioButton) findViewById(R.id.rbSumar);
        rbRestar = (RadioButton) findViewById(R.id.rbRestar);
        rbMultiplicar = (RadioButton) findViewById(R.id.rbMultiplicar);
        rbDividir = (RadioButton) findViewById(R.id.rbDividir);

    }

    //Accion del boton
    public void btnAccion(View vista){

        //Conversiones a String
        String valorA = etNumeroA.getText().toString();
        String valorB = etNumeroB.getText().toString();

        //Conversiones a enteros
        int numeroA = Integer.parseInt(valorA);
        int numeroB = Integer.parseInt(valorB);

        //Variable a usar
        String resultadoText = "¡¡Ingrese numeros para operar!!";

        //Logica check button
        if (rbSumar.isChecked()){
            int suma = numeroA + numeroB;
            resultadoText = String.valueOf(suma);
        }

        if (rbRestar.isChecked()){
            int resta = numeroA - numeroB;
            resultadoText = String.valueOf(resta);
        }

        if (rbMultiplicar.isChecked()){
            int multiplicacion = numeroA * numeroB;
            resultadoText = String.valueOf(multiplicacion);
        }

        if (rbDividir.isChecked()){
            if (numeroB == 0){
                resultadoText = "No se puede dividir por 0";

            }else{
                int division = numeroA / numeroB;
                resultadoText = String.valueOf(division);
            }
        }

        //Le enviamos el texto a la caja de texto.
        tvResultado.setText(resultadoText);
    }
}