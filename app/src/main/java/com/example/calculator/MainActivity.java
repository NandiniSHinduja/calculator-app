package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valueA;
    EditText valueB;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button submit;
    TextView display;
    Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        submit=(Button) findViewById(R.id.submit);
        cancel=(Button) findViewById(R.id.cancel);
        valueA=(EditText)findViewById(R.id.valueA);
        valueB=(EditText)findViewById(R.id.valueB);
        display=(TextView)findViewById(R.id.display);
        add.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String a=valueA.getText().toString();
                int m = Integer.parseInt(a);
                String b=valueB.getText().toString();
                int n=Integer.parseInt(b);
                Integer result=m+n;
                String res=result.toString();
                display.setText(res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String a=valueA.getText().toString();
                int m = Integer.parseInt(a);
                String b=valueB.getText().toString();
                int n=Integer.parseInt(b);
                Integer result=m-n;
                String res=result.toString();
                display.setText(res);
            }
        });
        mul.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String a=valueA.getText().toString();
                int m = Integer.parseInt(a);
                String b=valueB.getText().toString();
                int n=Integer.parseInt(b);
                Integer result=m*n;
                String res=result.toString();
                display.setText(res);
            }
        });
        div.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String a=valueA.getText().toString();
                int m = Integer.parseInt(a);
                String b=valueB.getText().toString();
                int n=Integer.parseInt(b);
                Integer result=m/n;
                String res=result.toString();
                display.setText(res);
            }
        });

    }

}