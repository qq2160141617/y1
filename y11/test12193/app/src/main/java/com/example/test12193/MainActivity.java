package com.example.test12193;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView yp;
String[] data={"1","2","3","4"};
    CheckBox checkBox,checkBox2,checkBox3;
    Button button2;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();

    yp=findViewById(R.id.yp);
    MyAdapter myAdapter=new MyAdapter(getApplicationContext(),data);
    yp.setAdapter(myAdapter);
    //复选框
      button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              CheckBox[] j={checkBox,checkBox2,checkBox3};
              String k="";
              for(int i=0;i<j.length;i++){
                  if(j[i].isChecked()){
                      k+=j[i].getText().toString()+".";
textView4.setText(k);
          //            Toast.makeText(MainActivity.this,"你选的语言是"+k,Toast.LENGTH_SHORT).show();

                  }

              }
          }
      });
    }

    private void initview() {
        checkBox=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        button2=findViewById(R.id.button2);
        textView4=findViewById(R.id.textView4);
    }
}