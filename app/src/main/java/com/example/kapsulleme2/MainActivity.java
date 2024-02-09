package com.example.kapsulleme2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextYas;
    EditText editTextMaas;
    TextView textViewSonuc;
    Button buttonKaydet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextYas=findViewById(R.id.editTextYas);
        editTextMaas=findViewById(R.id.editTextMaas);
        textViewSonuc=findViewById(R.id.textViewSonuc);
        buttonKaydet=findViewById(R.id.buttonKaydet);
        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yas=Integer.parseInt(editTextYas.getText().toString());
                int maas=Integer.parseInt(editTextMaas.getText().toString());

                Personel personel=new Personel();
                personel.setYas(yas);
                personel.setMaas(maas);
                textViewSonuc.setText("Yaş:"+personel.getYas()+"Maaş:"+personel.getMaas());
            }
        });
    }
}