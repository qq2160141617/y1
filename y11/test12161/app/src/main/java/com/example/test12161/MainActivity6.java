package com.example.test12161;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView textView8;
    EditText editText4;
    Button button14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        textView8=findViewById(R.id.textView8);
        editText4=findViewById(R.id.editText4);
        button14=findViewById(R.id.button14);
        //接受返回的值
        final Intent intent=getIntent();
        String key=intent.getStringExtra("key1");
        textView8.setText(key);
        //往回传值
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               intent.putExtra("kye2",editText4.getText().toString());
               setResult(120,intent);
               finish();
            }
        });
    }
}