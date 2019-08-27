package br.com.etechoracio.parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    EditText txtQtdeHoras;
    EditText txtValorHoras;
    EditText txtHoraAdicional;
    TextView lblTotal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQtdeHoras = findViewById(R.id.txtQtdeHoras);
        txtValorHoras = findViewById(R.id.txtValorHoras);
        txtHoraAdicional = findViewById(R.id.txtHoraAdicional);
        lblTotal2 = findViewById(R.id.lblTotal2);
    }
        public void onCalcular(View v){

        double qh = Double.parseDouble(txtQtdeHoras.getText().toString());
        double vh = Double.parseDouble(txtValorHoras.getText().toString());
        double hd = Double.parseDouble(txtHoraAdicional.getText().toString());


           double total = vh + hd *(qh - 1);
            lblTotal2.setText(String.valueOf(total));

        }
}
