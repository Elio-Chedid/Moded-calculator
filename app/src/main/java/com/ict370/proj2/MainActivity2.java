package com.ict370.proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText phone =(EditText) findViewById(R.id.phone);
        EditText delay=(EditText) findViewById(R.id.delay);
        Button sub= (Button) findViewById(R.id.button);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph=phone.getText().toString();
                String dl=delay.getText().toString();


                Intent intent =new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("PN",ph);
                intent.putExtra("del",dl);
                startActivity(intent);
            }
        });
    }
}