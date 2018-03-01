package com.example.mydeveloper.hitungnilai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText uas, uts;
    TextView nilai, peringkat;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peringkat = (TextView)findViewById(R.id.peringkatNilai);
        btn = (Button) findViewById(R.id.button);
        uas = (EditText) findViewById(R.id.nilaiUas);
        uts = (EditText) findViewById(R.id.nilaiUts);
        nilai = (TextView) findViewById(R.id.nilaiAkhir);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String nUas = uas.getText().toString().trim();
                String nUts = uts.getText().toString().trim();
//
                double nilaiUts = Double.parseDouble(nUas);
                double nilaiUas = Double.parseDouble(nUts);
                double nilai = (0.7 * nilaiUts) + (0.3 * nilaiUas);
                int myInt = (int) nilai;

                if (myInt >= 80) {
                    peringkat.setText("A");
                }else if (myInt >= 70){
                    peringkat.setText("B");
                }else if (myInt >= 60){
                    peringkat.setText("C");
                }else if (myInt >= 50){
                    peringkat.setText("D");
                }else{
                    peringkat.setText("E");

                }


                displayNilai(myInt);

            }
        });

    }


    public void displayNilai(int total) {
        TextView nilaiTotal = (TextView) findViewById(R.id.nilaiAkhir);
        nilaiTotal.setText(String.valueOf(total));
    }

}
