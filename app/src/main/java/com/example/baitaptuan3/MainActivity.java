package com.example.baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  Button btnChonMauScr1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr1);
        btnChonMauScr1 =findViewById(R.id.btnChonMauScr1);
        btnChonMauScr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    private void openActivity2() {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


}