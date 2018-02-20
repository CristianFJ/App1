package com.firesoul.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText2,editText3;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    String radio;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);
        editText= findViewById(R.id.editText);
        editText2= findViewById(R.id.editText2);
        editText3= findViewById(R.id.editText3);
        radioButton1= findViewById(R.id.radioButton1);
        radioButton2= findViewById(R.id.radioButton2);
        radioButton3= findViewById(R.id.radioButton3);
        radioButton4= findViewById(R.id.radioButton4);
    }




    public void onButtonClicked(View view) {

    }
    public void onRadioButtonClicked(View view) {
        this.view = view;
        int id=view.getId();

    /*    if(id == R.id.radioButton1){

            editText.setText("Ingrese el Radio");
            //code
        }else {
            editText2.setText("None");
            editText3.setText("None");
}*/
            switch (id){
                case R.id.radioButton1:
                    if(radioButton1.isChecked()) {
                        editText.setText("Nadar");
                    }
                    break;
                case R.id.radioButton2:
                    if(radioButton2.isChecked()) {
                        editText.setText("Cine");
                    }
                    break;
                case R.id.radioButton3:
                    if(radioButton3.isChecked()) {
                        editText.setText("Correr");
                    }
                    break;
                case R.id.radioButton4:
                    if(radioButton4.isChecked()) {
                        editText.setText("Correr");
                    }
                    break;
            }
        }
    }

