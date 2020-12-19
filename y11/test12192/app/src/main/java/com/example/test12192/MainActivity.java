package com.example.test12192;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup group;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group=findViewById(R.id.group);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<group.getChildCount();i++){
                    RadioButton radioButton=(RadioButton)group.getChildAt(i);
                    if(radioButton.isChecked()){
                       String j=radioButton.getText().toString();
                        Toast.makeText(MainActivity.this,"你的选择"+j,Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
    }
}