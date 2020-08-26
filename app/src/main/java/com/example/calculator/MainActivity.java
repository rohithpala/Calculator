package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView input , output;
    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_00,dot,plus,minus,asterisk,slash,c,perc,backspace,equal_to,sin,cos,tan,log,ln,e,ob,cb,power,sqroot,factorial,pie,inv,rad,deg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
        btn_1 = (Button) findViewById(R.id.number1);
        btn_2 = (Button) findViewById(R.id.number2);
        btn_3 = (Button) findViewById(R.id.number3);
        btn_4 = (Button) findViewById(R.id.number4);
        btn_5 = (Button) findViewById(R.id.number5);
        btn_6 = (Button) findViewById(R.id.number6);
        btn_7 = (Button) findViewById(R.id.number7);
        btn_8 = (Button) findViewById(R.id.number8);
        btn_9 = (Button) findViewById(R.id.number9);
        btn_0 = (Button) findViewById(R.id.number0);
        btn_00 = (Button) findViewById(R.id.number00);
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

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("0");
            }
        });

        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("00");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().length() == 0){
                    input.append("0.");
                }else {
                    input.append(".");
                }
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
                if(sin.getText() == "sin") {
                }else if(sin.getText() == "sin-1"){
                }
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

        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inv.getCurrentTextColor() == Color.WHITE) {
                    sin.setText(R.string.sin_inverse);
                    cos.setText(R.string.cos_inverse);
                    tan.setText(R.string.tan_inverse);
                    log.setText(R.string.log_inverse);
                    ln.setText(R.string.lon_inverse);
                    sqroot.setText(R.string.square_root_Inverse);
                    inv.setTextColor(Color.BLACK);
                }else if(inv.getCurrentTextColor() == Color.BLACK) {
                    sin.setText(R.string.sin);
                    cos.setText(R.string.cos);
                    tan.setText(R.string.tan);
                    log.setText(R.string.log);
                    ln.setText(R.string.lon);
                    sqroot.setText(R.string.square_root);
                    inv.setTextColor(Color.WHITE);
                }
            }
        });

        rad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rad.setTextColor(Color.WHITE);
                deg.setTextColor(Color.BLACK);
            }
        });

        deg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deg.setTextColor(Color.WHITE);
                rad.setTextColor(Color.BLACK);
            }
        });
    }
}