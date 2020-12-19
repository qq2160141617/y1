package com.example.test12161;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    EditText editText3;
    TextView textView7;
    Button button13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        editText3=findViewById(R.id.editText3);
        textView7=findViewById(R.id.textView7);
        button13=findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,MainActivity6.class);
                intent.putExtra("key1",editText3.getText().toString());
                startActivityForResult(intent,110);//启动跳转
            }
        });

    }


   @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       if(requestCode==110&&resultCode==120){
           String key2= data.getStringExtra("key2");
            textView7.setText(key2);
        }
    }
}