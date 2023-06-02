package com.example.mycomanda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumberQuant;

    RadioButton radioButtonP, radioButtonM, radioButtonG;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    Switch switchborda;

    CheckBox checkBox5, checkBox6, checkBox7;

    Button buttonGerar;

    TextView textViewNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumberQuant=findViewById(R.id.editTextNumberQuant);

        radioButtonP=findViewById(R.id.radioButtonP);
        radioButtonM=findViewById(R.id.radioButtonM);
        radioButtonG=findViewById(R.id.radioButtonG);

        checkBox1=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        checkBox4=findViewById(R.id.checkBox4);

        checkBox5=findViewById(R.id.checkBox5);
        checkBox6=findViewById(R.id.checkBox6);
        checkBox7=findViewById(R.id.checkBox7);

        buttonGerar=findViewById(R.id.button);

        textViewNota=findViewById(R.id.textViewNota);






        buttonGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tamanho = null;
                if (radioButtonP.isChecked()){
                    tamanho = radioButtonP.getText().toString();
                } else if (radioButtonM.isChecked()) {
                    tamanho = radioButtonM.getText().toString();
                } else if (radioButtonG.isChecked()) {
                    tamanho = radioButtonG.getText().toString();
                }

                String sabores = "";
                if (checkBox1.isChecked()){
                    sabores = sabores + checkBox1.getText().toString()+" | ";
                }
                if (checkBox2.isChecked()){
                    sabores =  sabores + checkBox2.getText().toString()+" | ";
                }
                if (checkBox3.isChecked()){
                    sabores =  sabores + checkBox3.getText().toString()+" | ";
                }
                if (checkBox4.isChecked()){
                    sabores = sabores + checkBox4.getText().toString()+" | ";
                }

                String borda = "";
                switchborda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    String borda = "";
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                        if (switchborda.isChecked()){
                            borda="SIM";
                        }else {
                            borda= "NÃO";
                        }
                    }
                });



                String bebidas = "";
                if (checkBox5.isChecked()){
                    bebidas = bebidas + checkBox5.getText().toString()+" | ";
                }
                if (checkBox6.isChecked()){
                    bebidas = bebidas + checkBox6.getText().toString()+" | ";
                }
                if (checkBox7.isChecked()){
                    bebidas = bebidas + checkBox7.getText().toString()+" | ";
                }

                String nota = "MY COMANDA\n"+ "Quantidade de pizzas: "+(editTextNumberQuant.getText().toString())+
                        "\nTamanho: "+tamanho+
                        "\nSabores: "+sabores+
                        "\nBorda Recheada: "+borda+
                        "\nBebidas: "+bebidas;
                textViewNota.setText(nota);
            }
        });
    }
}