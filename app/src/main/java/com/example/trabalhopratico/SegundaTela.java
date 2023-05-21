package com.example.trabalhopratico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    //Criando as variaveis.
    RadioGroup dir, esq;
    CheckBox ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        //Encontrando pelo id.
        dir = findViewById(R.id.dir);
        esq = findViewById(R.id.esq);
        result = findViewById(R.id.result);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch5 = findViewById(R.id.ch5);
        ch6 = findViewById(R.id.ch6);
        ch7 = findViewById(R.id.ch7);
        ch8 = findViewById(R.id.ch8);
        ch9 = findViewById(R.id.ch9);
        ch10 = findViewById(R.id.ch10);
    }

    //Botão para ir para a primeira tela.
    public void priTela(View view){
        Intent in = new Intent(SegundaTela.this, MainActivity.class);
        startActivity(in);
    }

    //Criando a função para verificar preço e item.
    public void pinPreco(View view){
       //Criando as variaveis.
        String op = "";

        double banana = 5.00;
        double maca = 2.00;
        double pao = 5.00;
        double agua = 7.00;
        double vinho = 20.50;
        double tomate = 3.00;
        double alface = 1.00;
        double pepino = 2.50;
        double macarrao = 10.00;
        double acucar = 6.00;

        double total = 00.00;

        //Checando quais as caixas foram selecionadas e mostrando nome e valor individual de cada item.
        if (ch1.isChecked()){
            op = op + ch1.getText() + " R$ " + banana + ", ";
            result.setText(op);
            total = total + banana;
        }
        if (ch2.isChecked()){
            op = op + ch2.getText() + " R$ " + maca + ", ";
            result.setText(op);
            total = total + maca;
        }
        if (ch3.isChecked()){
            op = op + ch3.getText() + " R$" + pao + ", ";
            result.setText(op);
            total = total + pao;
        }
        if (ch4.isChecked()){
            op = op + ch4.getText() + " R$" + agua + ", ";
            result.setText(op);
            total = total + agua;
        }
        if (ch5.isChecked()){
            op = op + ch5.getText() + " R$" + vinho + ", ";
            result.setText(op);
            total = total + vinho;
        }
        if (ch6.isChecked()){
            op = op + ch6.getText() + " R$ " + tomate + ", ";
            result.setText(op);
            total = total + tomate;
        }
        if (ch7.isChecked()){
            op = op + ch7.getText() + " R$ " + alface + ", ";
            result.setText(op);
            total = total + alface;
        }
        if (ch8.isChecked()){
            op = op + ch8.getText() + " R$ " + pepino + ", ";
            result.setText(op);
            total = total + pepino;
        }
        if (ch9.isChecked()){
            op = op + ch9.getText() + " R$ " + macarrao + ", ";
            result.setText(op);
            total = total + macarrao;
        }
        if (ch10.isChecked()){
            op = op + ch10.getText() + " R$ " + acucar + "";
            result.setText(op);
            total = total + acucar;
        }
        if (op.isEmpty()){
            result.setText("Nehuma opção selecionada!");
        }

        //Criando a caixa de alerta mostrando o valor total das compras.
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setTitle("Total");
        dialogo.setMessage("Total da compra é: " + total);
        dialogo.create();
        dialogo.show();
    }
}