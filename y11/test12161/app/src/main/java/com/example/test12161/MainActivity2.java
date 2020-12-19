package com.example.test12161;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button button7,button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //对话框
        button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder yp=new AlertDialog.Builder(MainActivity2.this);
                yp.setTitle("标题");
                yp.setMessage("内容");
               yp.setNegativeButton("no",null);
               yp.setPositiveButton("yes",null);
                yp.show();
            }
        });
        //进度条对话框
        button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog ypc=new ProgressDialog(MainActivity2.this);
                ypc.setTitle("标题");
                ypc.setMessage("加载中.......");
                ypc.setCancelable(true);//显示进度条
                ypc.show();
            }
        });
    }
}