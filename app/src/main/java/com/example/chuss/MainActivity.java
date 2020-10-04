package com.example.chuss;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnEqual,btnAdd,btnSubtract,btnMultiply,btnDivide,btnPoint,btnClear;
    EditText ed1;
    float result1,result2;
    boolean subtract,multiply,divide,add;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed1.setShowSoftInputOnFocus(false);

        btnOne = (Button) findViewById(R.id.one);
        btnTwo = (Button) findViewById(R.id.two);
        btnThree = (Button) findViewById(R.id.three);
        btnFour = (Button) findViewById(R.id.four);
        btnFive = (Button) findViewById(R.id.five);
        btnSix = (Button) findViewById(R.id.six);
        btnSeven = (Button) findViewById(R.id.seven);
        btnEight = (Button) findViewById(R.id.eight);
        btnNine = (Button) findViewById(R.id.nine);
        btnZero = (Button) findViewById(R.id.zero);

        btnAdd = (Button) findViewById(R.id.add);
        btnSubtract = (Button) findViewById(R.id.subtract);
        btnMultiply = (Button) findViewById(R.id.multiply);
        btnDivide = (Button) findViewById(R.id.divide);
        btnEqual = (Button) findViewById(R.id.equal);
        btnPoint = (Button) findViewById(R.id.point);
        btnClear = (Button) findViewById(R.id.clear);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText(null);
                }
                else{
                    result1=Float.parseFloat(ed1.getText()+"");
                    add=true;
                    ed1.setText(null);
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText(null);
                } else {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    subtract = true;
                    ed1.setText(null);
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText(null);
                } else {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    multiply = true;
                    ed1.setText(null);
                }
            }
        });


        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText(null);
                } else {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    divide = true;
                    ed1.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2 = Float.parseFloat(ed1.getText() + "");
                if (add == true) {
                    ed1.setText(result1 + result2 + "");
                    add = false;
                }



                if (subtract == true) {
                    ed1.setText(result1 - result2 + "");
                    subtract = false;
                }

                if (multiply == true) {
                    ed1.setText(result1 * result2 + "");
                    multiply = false;
                }
                if (divide == true) {
                    ed1.setText(result1 / result2 + "");
                    divide = false;
                }








            }
        });






btnClear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ed1.setText("");
    }
});

    }
}