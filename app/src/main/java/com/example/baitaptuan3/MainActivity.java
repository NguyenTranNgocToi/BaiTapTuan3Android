package com.example.baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  Button btnChonMauScr1, btntrang, btnDo, btnDen, btnXanh, btnXong;
    private ImageView imgScr2, imgScr3, imgScr1;
    private TextView txtMau;
    private String mau ="Xanh";
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr1);
        btnChonMauScr1 =findViewById(R.id.btnChonMauScr1);
        btnChonMauScr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScr2();
            }
        });


    }

    private void openScr2() {
        setContentView(R.layout.scr2);
        imgScr2 = findViewById(R.id.imageScr2);
        btntrang = findViewById(R.id.buttonTrang);
        btntrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr2.setImageResource(R.drawable.vs_bac1);
                mau ="bac";
            }
        });

        btnDo = findViewById(R.id.buttonDo);
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr2.setImageResource(R.drawable.vs_red_a2);
                mau ="do";
            }
        });

        btnDen = findViewById(R.id.buttonDen);
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr2.setImageResource(R.drawable.vsmart_black_star1);
                mau ="den";
            }
        });

        btnXanh = findViewById(R.id.buttonXanh);
        btnXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr2.setImageResource(R.drawable.vsmart_live_xanh2);
                mau ="xanh";
            }
        });
        btnXong = findViewById(R.id.buttonXong);
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openScr3();
            }
        });
    }
    private void openScr3(){
        setContentView(R.layout.scr3);
        imgScr3 = findViewById(R.id.imageScr3);
        txtMau =findViewById(R.id.textMau);
        if(mau.equals("Xanh")){
            imgScr3.setImageResource(R.drawable.vsmart_live_xanh2);
            txtMau.setText("Xanh");
        }
        if(mau.equals("bac")){
            imgScr3.setImageResource(R.drawable.vs_bac1);
            txtMau.setText("Bạc");
        }
        if(mau.equals("den")){
            imgScr3.setImageResource(R.drawable.vsmart_black_star1);
            txtMau.setText("Đen");
        }
        if(mau.equals("do")){
            imgScr3.setImageResource(R.drawable.vs_red_a2);
            txtMau.setText("Đỏ");
        }

        btntrang = findViewById(R.id.buttonTrang);
        btntrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr3.setImageResource(R.drawable.vs_bac1);
                mau ="bac";
                txtMau.setText("Bạc");
            }
        });

        btnDo = findViewById(R.id.buttonDo);
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr3.setImageResource(R.drawable.vs_red_a2);
                mau ="do";
                txtMau.setText("Đỏ");
            }
        });

        btnDen = findViewById(R.id.buttonDen);
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr3.setImageResource(R.drawable.vsmart_black_star1);
                mau ="den";
                txtMau.setText("Đen");
            }
        });

        btnXanh = findViewById(R.id.buttonXanh);
        btnXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgScr3.setImageResource(R.drawable.vsmart_live_xanh2);
                mau ="xanh";
                txtMau.setText("Xanh");
            }
        });
        btnXong = findViewById(R.id.buttonXong);
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScr1();
            }
        });

    }
    private void openScr1(){
        setContentView(R.layout.scr1);
        imgScr1 = findViewById(R.id.imgScr1);
        btnChonMauScr1 =findViewById(R.id.btnChonMauScr1);
        if(mau.equals("Xanh")){
            imgScr1.setImageResource(R.drawable.vsmart_live_xanh2);
            btnChonMauScr1.setText("Xanh");
        }
        if(mau.equals("bac")){
            imgScr1.setImageResource(R.drawable.vs_bac1);
            btnChonMauScr1.setText("Bạc");
        }
        if(mau.equals("den")){
            imgScr1.setImageResource(R.drawable.vsmart_black_star1);
            btnChonMauScr1.setText("Đen");
        }
        if(mau.equals("do")){
            imgScr1.setImageResource(R.drawable.vs_red_a2);
            btnChonMauScr1.setText("Đỏ");
        }
        btnChonMauScr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScr2();
            }
        });
    }


}