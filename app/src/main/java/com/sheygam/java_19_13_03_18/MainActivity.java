package com.sheygam.java_19_13_03_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button myButton, thirdButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.my_button);
        thirdButton = findViewById(R.id.third_btn);
        thirdButton.setOnClickListener(this);
        myButton.setOnClickListener(this);
    }

    public void myButtonClick(View view){
        Log.d("MY_TAG","Was click my button");
    }


    @Override
    public void onClick(View v) {
        Log.d("MY_TAG", "onClick: ");
        if (v.getId() == R.id.my_button){
            Log.d("MY_TAG", "onClick: my button");
        }else if(v.getId() == R.id.third_btn){
            Log.d("MY_TAG", "onClick: third button");
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
    }
}
