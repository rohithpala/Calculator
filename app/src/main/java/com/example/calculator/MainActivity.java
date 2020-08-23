package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView input , output;
    private Button no1,no2,no3,no4,no5,no6,no7,no8,no9,no0,no00,dot,plus,minus,asterisk,slash,c,perc,backspace,equal_to,sin,cos,tan,log,ln,e,ob,cb,power,sqroot,factorial,pie,inv,rad,deg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
        no1 = (Button) findViewById(R.id.number1);
        no2 = (Button) findViewById(R.id.number2);
        no3 = (Button) findViewById(R.id.number3);
        no4 = (Button) findViewById(R.id.number4);
        no5 = (Button) findViewById(R.id.number5);
        no6 = (Button) findViewById(R.id.number6);
        no7 = (Button) findViewById(R.id.number7);
        no8 = (Button) findViewById(R.id.number8);
        no9 = (Button) findViewById(R.id.number9);
        no0 = (Button) findViewById(R.id.number0);
        no00 = (Button) findViewById(R.id.number00);
        dot = (Button) findViewById(R.id.dot);
        plus = (Button) findViewById(R.id.addition);
        minus = (Button) findViewById(R.id.substraction);
        asterisk = (Button) findViewById(R.id.multiplication);
        slash = (Button) findViewById(R.id.division);
        c = (Button) findViewById(R.id.clear);
        perc = (Button) findViewById(R.id.percentage);
        backspace = (Button) findViewById(R.id.backspace);
        equal_to = (Button) findViewById(R.id.equal);
        sin = (Button) findViewById(R.id.sine);
        cos = (Button) findViewById(R.id.cosine);
        tan = (Button) findViewById(R.id.tangent);
        log = (Button) findViewById(R.id.log);
        ln = (Button) findViewById(R.id.ln);
        e = (Button) findViewById(R.id.NLe);
        ob = (Button) findViewById(R.id.opening_bracket);
        cb = (Button) findViewById(R.id.closing_bracket);
        power = (Button) findViewById(R.id.power);
        sqroot = (Button) findViewById(R.id.square_root);
        factorial = (Button) findViewById(R.id.factorial);
        pie = (Button) findViewById(R.id.math_pie);
        inv = (Button) findViewById(R.id.inverse);
        rad = (Button) findViewById(R.id.radians);
        deg = (Button) findViewById(R.id.degrees);

        input.setText(null);

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("1");
            }
        });

        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("2");
            }
        });

        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("3");
            }
        });

        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("4");
            }
        });

        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("5");
            }
        });

        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("6");
            }
        });

        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("7");
            }
        });

        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("8");
            }
        });

        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("9");
            }
        });

        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("0");
            }
        });

        no00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("00");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(".");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("-");
            }
        });

        asterisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("*");
            }
        });

        slash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("/");
            }
        });

        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("4");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(null);
            }
        });

        perc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("%");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                int l = text.length();
                if(l==0){
                    input.setText(null);
                }
                else{
                    text = text.substring(0,l-1);
                    input.setText(text);
                }
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("sin(");
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("cos(");
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("tan(");
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("log(");
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("ln(");
            }
        });

        ob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("(");
            }
        });

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(")");
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("^");
            }
        });

        sqroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("@string/Square_Root");
            }
        });

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("!");
            }
        });

        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("π");
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("e");
            }
        });

    }
}