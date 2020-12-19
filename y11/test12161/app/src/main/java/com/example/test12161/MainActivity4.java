package com.example.test12161;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    RadioGroup group;
    Button button16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        group=findViewById(R.id.group);
        button16=findViewById(R.id.button16);

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String j="" ;
                for(int i=0;i<group.getChildCount();i++){
                    RadioButton radioButton=(RadioButton)group.getChildAt(i);
                    if(radioButton.isChecked()){
                       j=radioButton.getText().toString();
                        Toast.makeText(MainActivity4.this,"你是"+j+"性",Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
    }
}