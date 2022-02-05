package com.example.calculator_contraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText display;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, divide, multiply, minus, add, equals, clear, backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intialize();
    }

    private void intialize()
    {
        one = findViewById(R.id.btn_one);
        two = findViewById(R.id.btn_two);
        three = findViewById(R.id.btn_three);
        four = findViewById(R.id.btn_four);
        five = findViewById(R.id.btn_five);
        six = findViewById(R.id.btn_six);
        seven = findViewById(R.id.btn_seven);
        eight = findViewById(R.id.btn_eight);
        nine = findViewById(R.id.btn_nine);
        zero = findViewById(R.id.btn_zero);
        equals = findViewById(R.id.btn_equals);
        display = findViewById(R.id.editTextTextPersonName4);
        divide = findViewById(R.id.btn_divide);
        multiply = findViewById(R.id.btn_multiply);
        minus = findViewById(R.id.btn_minus);
        add = findViewById(R.id.btn_plus);
        clear = findViewById(R.id.btn_clear);



        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        equals.setOnClickListener(this);
        display.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        minus.setOnClickListener(this);
        add.setOnClickListener(this);
        clear.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.findViewById(R.id.btn_one) == one) {
            if (!display.getText().equals("")) {
                display.append("1");
            } else {
                display.setText("1");
            }
        }
        else if (view.findViewById(R.id.btn_two) == two) {
            if (!display.getText().equals("")) {
                display.append("2");
            } else {
                display.setText("2");
            }
        }
        else if (view.findViewById(R.id.btn_three) == three) {
            if (!display.getText().equals("")) {
                display.append("3");
            } else {
                display.setText("3");
            }
        }

        else if (view.findViewById(R.id.btn_four) == four) {
            if (!display.getText().equals("")) {
                display.append("4");
            } else {
                display.setText("4");
            }
        }

        else if (view.findViewById(R.id.btn_five) == five) {
            if (!display.getText().equals("")) {
                display.append("5");
            } else {
                display.setText("5");
            }
        }

        else if (view.findViewById(R.id.btn_six) == six) {
            if (!display.getText().equals("")) {
                display.append("6");
            } else {
                display.setText("6");
            }
        }

        else if (view.findViewById(R.id.btn_seven) == seven) {
            if (!display.getText().equals("")) {
                display.append("7");
            } else {
                display.setText("7");
            }
        }

        else if (view.findViewById(R.id.btn_eight) == eight) {
            if (!display.getText().equals("")) {
                display.append("8");
            } else {
                display.setText("8");
            }
        }

        else if (view.findViewById(R.id.btn_nine) == nine) {
            if (!display.getText().equals("")) {
                display.append("9");
            } else {
                display.setText("9");
            }
        }

        else if (view.findViewById(R.id.btn_zero) == zero) {
            if (!display.getText().equals("")) {
                display.append("0");
            } else {
                display.setText("0");
            }
        }

        else if (view.findViewById(R.id.btn_plus) == add) {
            if (!display.getText().equals("")) {
                display.append("+");
            } else {
                display.setText("+");
            }
        }

        else if (view.findViewById(R.id.btn_divide) == divide) {
            if (!display.getText().equals("")) {
                display.append("/");
            } else {
                display.setText("/");
            }
        }

        else if (view.findViewById(R.id.btn_multiply) == multiply) {
            if (!display.getText().equals("")) {
                display.append("*");
            } else {
                display.setText("*");
            }
        }

        else if (view.findViewById(R.id.btn_minus) == minus)
        {
            if (!display.getText().equals(""))
            {
                display.append("-");
            }
            else
            {
                display.setText("-");
            }
        }

        else if (view.findViewById(R.id.editTextTextPersonName4) == display) {

        }

        else if (view.findViewById(R.id.btn_clear) == clear) {
            display.setText(null);
        }

        else if (view.findViewById(R.id.btn_equals) == equals) {
            if (!display.getText().equals("")) {
                calculate(display.getText().toString());
            } else {
                Toast.makeText(this, "Nothing to Calculate", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void calculate(String displayParam) {
        //Toast.makeText(this, display, Toast.LENGTH_SHORT).show();

        Expression expression = new ExpressionBuilder(displayParam).build();
        try {
            // Calculate the result and display
            Double result = expression.evaluate();
            display.setText(result.toString());
        } catch (ArithmeticException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}