package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double val1,val2;
    TextView textView;
    boolean Addition,Subtraction,Multiplication,Division,reminder,decimal;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonadd,buttonsub,buttonmul,buttondiv,buttonreminder,buttonequal,buttonclear,buttondot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=(Button)findViewById(R.id.btn0);
        button1=(Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        button3=(Button)findViewById(R.id.btn3);
        button4=(Button)findViewById(R.id.btn4);
        button5=(Button)findViewById(R.id.btn5);
        button6=(Button)findViewById(R.id.btn6);
        button7=(Button)findViewById(R.id.btn7);
        button8=(Button)findViewById(R.id.btn8);
        button9=(Button)findViewById(R.id.btn9);
        buttonadd=(Button)findViewById(R.id.btnadd);
        buttonsub=(Button)findViewById(R.id.btnsub);
        buttonmul=(Button)findViewById(R.id.btnmul);
        buttondiv=(Button)findViewById(R.id.btndiv);
        buttonreminder=(Button)findViewById(R.id.btnreminder);
        buttondot=(Button)findViewById(R.id.btndot);
        buttonequal=(Button)findViewById(R.id.btneq);
        buttonclear=(Button)findViewById(R.id.clearbtn);
        textView=(TextView)findViewById(R.id.display);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "0");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length()!=0){
                    val1=Float.parseFloat(textView.getText() +"");
                    Addition=true;
                    decimal=false;
                    textView.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length()!=0){
                    val1=Float.parseFloat(textView.getText() +"");
                    Subtraction=true;
                    decimal=false;
                    textView.setText(null);
                }
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length()!=0){
                    val1=Float.parseFloat(textView.getText() +"");
                    Multiplication=true;
                    decimal=false;
                    textView.setText(null);
                }
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length()!=0){
                    val1=Float.parseFloat(textView.getText() +"");
                    Division=true;
                    decimal=false;
                    textView.setText(null);
                }
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Addition || Subtraction || Multiplication || Division || reminder){
                    val2 = Float.parseFloat(textView.getText() +"");
                }
                if(Addition){
                    textView.setText(val1+val2+"");
                    Addition = false;
                }
                if(Subtraction){
                    textView.setText(val1-val2+"");
                    Subtraction = false;
                }
                if(Multiplication){
                    textView.setText(val1*val2+"");
                    Multiplication = false;
                }
                if(Division){
                    textView.setText(val1/val2+"");
                    Division = false;
                }
                if(reminder){
                    textView.setText(val1%val2 +"");
                    reminder=false;
                }
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                val1=0.0;
                val2=0.0;
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimal){

                } else  {
                    textView.setText(textView.getText()+"");
                    decimal=true;
                }
            }
        });
        buttonreminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Float.parseFloat(textView.getText() +"");
                reminder=true;
                decimal=false;
                textView.setText(null);
            }
        });
    }

}