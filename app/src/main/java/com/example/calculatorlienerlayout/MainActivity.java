package com.example.calculatorlienerlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String resultBot=new String();
    String resultTop=new String();
    String operator=new String();
    TextView buttonResultTop;
    TextView buttonResultBot;
//    Button ButtonZero;
//    Button ButtonOne;
//    Button ButtonTwo;
//    Button ButtonThree;
//    Button ButtonFour;
//    Button ButtonFive;
//    Button ButtonSix;
//    Button ButtonSeven;
//    Button ButtonEight;
//    Button ButtonNine;
//    Button ButtonResult;
//    Button ButtonAdd;
//    Button ButtonSub;
//    Button ButtonMulti;
//    Button ButtonDiv;
//    Button ButtonDelete;
//    Button ButtonDeleteAll;
//    Button ButtonDeleteOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonResultBot=findViewById(R.id.buttonResultBot);
        buttonResultTop=findViewById(R.id.buttonResultTop);
        findViewById(R.id.ButtonZero).setOnClickListener(this);
        findViewById(R.id.ButtonOne).setOnClickListener(this);
        findViewById(R.id.ButtonTwo).setOnClickListener(this);
        findViewById(R.id.ButtonThree).setOnClickListener(this);
        findViewById(R.id.ButtonFour).setOnClickListener(this);
        findViewById(R.id.ButtonFive).setOnClickListener(this);
        findViewById(R.id.ButtonSix).setOnClickListener(this);
        findViewById(R.id.ButtonSeven).setOnClickListener(this);
        findViewById(R.id.ButtonEight).setOnClickListener(this);
        findViewById(R.id.ButtonNine).setOnClickListener(this);
        findViewById(R.id.ButtonAdd).setOnClickListener(this);
        findViewById(R.id.ButtonSub).setOnClickListener(this);
        findViewById(R.id.ButtonMulti).setOnClickListener(this);
        findViewById(R.id.ButtonDiv).setOnClickListener(this);
        findViewById(R.id.ButtonDelete).setOnClickListener(this);
        findViewById(R.id.ButtonDeleteAll).setOnClickListener(this);
        findViewById(R.id.ButtonDeleteOne).setOnClickListener(this);
        findViewById(R.id.ButtonResult).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id ==R.id.ButtonResult){
            if(!resultBot.isEmpty()){
                if(!resultTop.isEmpty()){
                    int one=Integer.parseInt(resultTop);
                    int two=Integer.parseInt(resultBot);
                    if(operator=="+"){
                        resultTop=resultTop+"+"+resultBot+"=";
                        resultBot=Integer.toString(one+two);
                        buttonResultBot.setText(resultBot);
                        buttonResultTop.setText(resultTop);
                        resultTop=resultBot;
                    }else if(operator=="-"){
                        resultTop=resultTop+"-"+resultBot+"=";
                        resultBot=Integer.toString(one-two);
                        buttonResultBot.setText(resultBot);
                        buttonResultTop.setText(resultTop);
                        resultTop=resultBot;
                    }else if(operator=="x"){
                        resultTop=resultTop+"x"+resultBot+"=";
                        resultBot=Integer.toString(one*two);
                        buttonResultBot.setText(resultBot);
                        buttonResultTop.setText(resultTop);
                        resultTop=resultBot;
                    }else if(operator=="/"){
                        if(two!=0){
                            resultTop=resultTop+"/"+resultBot+"=";
                            resultBot=Integer.toString(one/two);
                            buttonResultBot.setText(resultBot);
                            buttonResultTop.setText(resultTop);
                            resultTop=resultBot;
                        }else{
                            resultTop="";
                            resultBot="Cannot divide by zero";
                            buttonResultTop.setText(" ");
                        }
                    }
                }
                buttonResultBot.setText(resultBot);
                if(resultBot.equals("Cannot divide by zero")){
                    resultBot="";
                }
            }
        }else  if(id ==R.id.ButtonDelete){
            if(!resultBot.isEmpty()){
                //loai bo ky tu cuoi cung
                resultBot=resultBot.substring(0, resultBot.length()-1) + resultBot.substring(resultBot.length()-1 + 1);
                if(!resultBot.isEmpty()){
                    buttonResultBot.setText(resultBot);
                }else{
                    buttonResultBot.setText("0");
                }
            }
        }else  if(id ==R.id.ButtonDeleteAll){
            resultBot="";
            resultTop="";
            buttonResultBot.setText("0");
            buttonResultTop.setText(" ");
        }else  if(id ==R.id.ButtonDeleteOne){
            resultBot="";
            buttonResultBot.setText("0");
        }else  if(id ==R.id.ButtonOne){
            resultBot+="1";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonTwo){
            resultBot+="2";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonThree){
            resultBot+="3";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonFour){
            resultBot+="4";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonFive){
            resultBot+="5";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonSix){
            resultBot+="6";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonSeven){
            resultBot+="7";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonEight){
            resultBot+="8";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonNine){
            resultBot+="9";
            buttonResultBot.setText(resultBot);
        }else  if(id ==R.id.ButtonZero){
            if(!buttonResultBot.getText().toString().equals("0")){
                resultBot+="0";
                buttonResultBot.setText(resultBot);
            }
        }else  if(id ==R.id.ButtonAdd){
            operator="+";
            if(!resultBot.isEmpty()){
                resultTop=resultBot;
                resultBot="";
                buttonResultTop.setText(resultTop+operator);
            }else if(!resultTop.isEmpty()){
                buttonResultTop.setText(resultTop+operator);
            }
        }else  if(id ==R.id.ButtonSub){
            operator="-";
            if(!resultBot.isEmpty()){
                resultTop=resultBot;
                resultBot="";
                buttonResultTop.setText(resultTop+operator);
            }else if(!resultTop.isEmpty()){
                buttonResultTop.setText(resultTop+operator);
            }
        }else  if(id ==R.id.ButtonMulti){
            operator="x";
            if(!resultBot.isEmpty()){
                resultTop=resultBot;
                resultBot="";
                buttonResultTop.setText(resultTop+operator);
            }else if(!resultTop.isEmpty()){
                buttonResultTop.setText(resultTop+operator);
            }
        }else  if(id ==R.id.ButtonDiv){
            operator="/";
            if(!resultBot.isEmpty()){
                resultTop=resultBot;
                resultBot="";
                buttonResultTop.setText(resultTop+operator);
            }else if(!resultTop.isEmpty()){
                buttonResultTop.setText(resultTop+operator);
            }
        }
    }
}
