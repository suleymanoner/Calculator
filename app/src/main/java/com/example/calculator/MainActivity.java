package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textNumbers;
    Button buttonCalculate;
    Button buttonSum;
    Button buttonDeduct;
    Button buttonMultiply;
    Button buttonDivide;
    TextView textResult;
    Button numberOne;
    Button numberTwo;
    Button numberThree;
    Button numberFour;
    Button numberFive;
    Button numberSix;
    Button numberSeven;
    Button numberEight;
    Button numberNine;
    Button numberZero;
    Button buttonC;
    Button buttonDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNumbers = findViewById(R.id.textNumbers);
        textNumbers.setText("");
        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonSum = findViewById(R.id.buttonSum);
        buttonDeduct = findViewById(R.id.buttonDeduct);
        buttonMultiply = findViewById(R.id.buttonDivide);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonC = findViewById(R.id.buttonC);
        buttonDel = findViewById(R.id.buttonDel);
        textResult = findViewById(R.id.textResult);
    }

    public void wOne(View view){
        numberOne = findViewById(R.id.numberOne);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "1";
        textNumbers.setText(n);
    }

    public void wTwo(View view){
        numberTwo = findViewById(R.id.numberTwo);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "2";
        textNumbers.setText(n);
    }

    public void wThree(View view){
        numberThree = findViewById(R.id.numberThree);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "3";
        textNumbers.setText(n);
    }

    public void wFour(View view){
        numberFour = findViewById(R.id.numberFour);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "4";
        textNumbers.setText(n);
    }

    public void wFive(View view){
        numberFive = findViewById(R.id.numberFive);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "5";
        textNumbers.setText(n);
    }

    public void wSix(View view){
        numberSix = findViewById(R.id.numberSix);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "6";
        textNumbers.setText(n);
    }

    public void wSeven(View view){
        numberSeven = findViewById(R.id.numberSeven);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "7";
        textNumbers.setText(n);
    }

    public void wEight(View view){
        numberEight = findViewById(R.id.numberEight);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "8";
        textNumbers.setText(n);
    }

    public void wNine(View view){
        numberNine = findViewById(R.id.numberNine);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "9";
        textNumbers.setText(n);
    }

    public void wZero(View view){
        numberZero = findViewById(R.id.numberZero);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "0";
        textNumbers.setText(n);
    }

    public void sum(View view){
        buttonSum = findViewById(R.id.buttonSum);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "+";
        textNumbers.setText(n);
    }

    public void deduct(View view){
        buttonDeduct = findViewById(R.id.buttonDeduct);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "-";
        textNumbers.setText(n);
    }

    public void multiply(View view){
        buttonMultiply = findViewById(R.id.buttonMultiply);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "x";
        textNumbers.setText(n);
    }

    public void divide(View view){
        buttonDivide = findViewById(R.id.buttonDivide);
        textNumbers = findViewById(R.id.textNumbers);
        String n = textNumbers.getText() + "/";
        textNumbers.setText(n);
    }

    public void deleteDel(View view){
        textNumbers = findViewById(R.id.textNumbers);
        String re = (String) textNumbers.getText();
        buttonDel = findViewById(R.id.buttonC);

        if(re.isEmpty()){
            Toast.makeText(this, "There is no number to delete!", Toast.LENGTH_SHORT).show();
        }
        else{
            String ne = re.substring(0,re.length()-1);
            textNumbers.setText(ne);
        }
    }

    public void deleteC(View view){
        textNumbers = findViewById(R.id.textNumbers);
        String re = (String) textNumbers.getText();
        buttonC = findViewById(R.id.buttonC);

        if(re.isEmpty()){
            Toast.makeText(this, "It is already empty!", Toast.LENGTH_SHORT).show();
        }
        else{
            String ne = "";
            textNumbers.setText(ne);
        }
    }

    public void calculate(View view){
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textNumbers = findViewById(R.id.textNumbers);
        textResult = findViewById(R.id.textResult);
        String n = (String) textNumbers.getText();

        String a = "+";
        String b = "-";
        String c = "x";
        String d = "/";

        if(n.isEmpty()){
            Toast.makeText(this, "Please enter number!", Toast.LENGTH_SHORT).show();
        }
        else if(n.contains(a) && n.contains(b)){
            textResult.setText("Result :");
            Toast.makeText(this, "Please just choose one operation!", Toast.LENGTH_SHORT).show();
        }
        else if(n.contains(b) && n.contains(c)){
            textResult.setText("Result :");
            Toast.makeText(this, "Please just choose one operation!", Toast.LENGTH_SHORT).show();
        }
        else if(n.contains(c) && n.contains(d)){
            textResult.setText("Result :");
            Toast.makeText(this, "Please just choose one operation!", Toast.LENGTH_SHORT).show();
        }
        else if(n.contains(a) && n.contains(c)){
            textResult.setText("Result :");
            Toast.makeText(this, "Please just choose one operation!", Toast.LENGTH_SHORT).show();
        }
        else if(n.contains(a) && n.contains(d)){
            textResult.setText("Result :");
            Toast.makeText(this, "Please just choose one operation!", Toast.LENGTH_SHORT).show();
        }
        else if(n.contains(b) && n.contains(d)){
            textResult.setText("Result :");
            Toast.makeText(this, "Please just choose one operation!", Toast.LENGTH_SHORT).show();
        }
        else if(n.contains(a)){
            textResult = findViewById(R.id.textResult);

            if(n.endsWith(a) || n.startsWith(a)){
                Toast.makeText(this, "Please enter proper numbers!", Toast.LENGTH_SHORT).show();
            }
            else{
                int t = n.indexOf(a);

                String sub = "";
                String sub2 = "";

                if(t != -1){
                    sub = n.substring(0,t);
                    sub2 = n.substring(t+1,n.length());
                }

                String one = sub;
                String two = sub2;

                double y = Double.parseDouble(one);
                double o = Double.parseDouble(two);

                textResult = findViewById(R.id.textResult);
                double res = y + o ;
                textResult.setText("Result is : " + res);
            }

        }
        else if(n.contains(b)){
            textResult = findViewById(R.id.textResult);

            if(n.startsWith(b) || n.endsWith(b)){
                Toast.makeText(this, "Please enter proper numbers!", Toast.LENGTH_SHORT).show();
            }
            else{
                int t = n.indexOf(b);
                String sub = "";
                String sub2 = "";
                if(t != -1){
                    sub = n.substring(0,t);
                    sub2 = n.substring(t+1,n.length());
                }
                String one = sub;
                String two = sub2;

                double y = Double.parseDouble(one);
                double o = Double.parseDouble(two);

                textResult = findViewById(R.id.textResult);
                double res = y - o ;
                textResult.setText("Result is : " + res);
            }
        }
        else if(n.contains(c)){
            textResult = findViewById(R.id.textResult);

            if(n.startsWith(c) || n.endsWith(c)){
                Toast.makeText(this, "Please enter proper numbers!", Toast.LENGTH_SHORT).show();
            }
            else{
                int t = n.indexOf(c);
                String sub = "";
                String sub2 = "";
                if(t != -1){
                    sub = n.substring(0,t);
                    sub2 = n.substring(t+1,n.length());
                }
                String one = sub;
                String two = sub2;

                double y = Double.parseDouble(one);
                double o = Double.parseDouble(two);

                textResult = findViewById(R.id.textResult);
                double res = y * o ;
                textResult.setText("Result is : " + res);
            }
        }
        else if(n.contains(d)){
            textResult = findViewById(R.id.textResult);

            if(n.startsWith(d) || n.endsWith(d)){
                Toast.makeText(this, "Please enter proper numbers!", Toast.LENGTH_SHORT).show();
            }
            else{
                int t = n.indexOf(d);
                String sub = "";
                String sub2 = "";
                if(t != -1){
                    sub = n.substring(0,t);
                    sub2 = n.substring(t+1,n.length());
                }
                String one = sub;
                String two = sub2;

                double y = Double.parseDouble(one);
                double o = Double.parseDouble(two);

                textResult = findViewById(R.id.textResult);
                double res = y / o ;
                textResult.setText("Result is : " + res);
            }
        }
    }
}