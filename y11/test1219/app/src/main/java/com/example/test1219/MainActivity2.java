package com.example.test1219;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText editText2;
    TextView textView2;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText2=findViewById(R.id.editText2);
        textView2=findViewById(R.id.textView2);
        button2=findViewById(R.id.button2);
        final Intent intent=getIntent();
        String key1=intent.getStringExtra("key1");
        textView2.setText(key1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               intent.putExtra("key2",editText2.getText().toString());
               setResult(222,intent);
               finish();
            }
        });

    }
}