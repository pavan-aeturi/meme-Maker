package com.example.mememaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements upper_fragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        upper_fragment u=(upper_fragment)getSupportFragmentManager().findFragmentById(R.id.fragment3);
//        final EditText e1=(EditText) u.getView().findViewById(R.id.top);
//        final EditText e2=(EditText) u.getView().findViewById(R.id.bottom);
//
//
//        e1.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        e1.setText("");
//
//                    }
//                }
//        );
//        e2.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        e2.setText("");
//
//                    }
//                }
//        );

    }

    @Override
    public void createMeme(String s1, String s2) {
        lower_fragment l=(lower_fragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        l.setMeme(s1,s2);
    }
}
