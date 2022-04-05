package com.example.mathsteacher;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text, text0, text1;
    Button buttonSum, buttonSub, buttonMul, buttonDiv, buttonDot, buttonEqual, buttonClear,
            button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
    buttonTriangleArea, buttonCircleArea, buttonTrapezoidArea, buttonDeltoid,
            buttonCircleCircumference, buttonParallelogramDiamondArea;
    private final char sum = '+', sub = '-', mul = '*', div = '/', equal = 0;
    private char action;
    float value = Float.NaN;
    float value0 = Float.NaN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetView();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "9");
            }
        });
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc();
                action = sum;
                text0.setText(text0.getText().toString() + "+");
                text.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc();
                action = sub;
                text0.setText(text0.getText().toString() + "-");
                text.setText(null);

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc();
                action = mul;
                text0.setText(text0.getText().toString() + "*");
                text.setText(null);

            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc();
                action = div;
                text0.setText(text0.getText().toString() + "/");
                text.setText(null);

            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + ".");
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length() > 0){
                    CharSequence name = text.getText().toString();
                    text.setText(name.subSequence(0, name.length()-1));
                }else {
                    value = Float.NaN;
                    value0 = Float.NaN;
                    text.setText(null);
                    text0.setText(null);
                    text1.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc();
                action = equal;
                text0.setText(text0.getText().toString() + value0 + "=" + value);
                text.setText(null);
            }
        });
        buttonTriangleArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText().toString() + " P=0.5*a*h, where a is a length of a base and h is height of a triangle.");
            }
        });
        buttonCircleArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText().toString() + " P=πr^2, where r is length of a radius.");
            }
        });
        buttonTrapezoidArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText().toString() + " P=0.5(a+b)*h, where a&b are representing length of bases and h is height of a trapezoid.");
            }
        });
        buttonDeltoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText().toString() + " P=0.5d1 * d2, where d1 and d2 are diagonals of the deltoid.");
            }
        });
        buttonParallelogramDiamondArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText().toString() + " P=a*h, where a is length of a base and h is height.");
            }
        });
        buttonCircleCircumference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText().toString() + " Ob=2πr, where r is length of a radius.");
            }
        });
    }

    private void SetView(){
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        text = findViewById(R.id.text);
        text0 = findViewById(R.id.text0);
        text1 = findViewById(R.id.text1);
        buttonSum = findViewById(R.id.buttonSum);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonDot = findViewById(R.id.buttonDot);
        buttonClear = findViewById(R.id.buttonClear);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonTriangleArea = findViewById(R.id.buttonTriangle);
        buttonCircleArea = findViewById(R.id.buttonCA);
        buttonTrapezoidArea = findViewById(R.id.buttonTA);
        buttonDeltoid = findViewById(R.id.buttonDeltoid);
        buttonParallelogramDiamondArea = findViewById(R.id.buttonPDA);
        buttonCircleCircumference = findViewById(R.id.buttonCC);
    }

    private void Calc(){
        if (!Float.isNaN(value)){
            value0 = Float.parseFloat(text.getText().toString());

            switch (action){
                case sum:
                    value = value + value0;
                    break;
                case sub:
                    value = value - value0;
                    break;
                case mul:
                    value = value * value0;
                    break;
                case div:
                    value = value / value0;
                    break;
                case equal:
                    break;
            }
        }else {
            value = Float.parseFloat(text.getText().toString());
        }
    }
}
