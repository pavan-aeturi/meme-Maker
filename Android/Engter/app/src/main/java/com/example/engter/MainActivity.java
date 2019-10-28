package com.example.engter;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    Button b;
    int ID=2;
    TextView username;
    private GestureDetectorCompat gestureDetectorCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        RelativeLayout pavansLayout=new RelativeLayout(this);
        pavansLayout.setBackgroundColor(Color.parseColor("#F0FFFF"));

        b=new Button(this);
        gestureDetectorCompat=new GestureDetectorCompat(this,this);
        b.setBackgroundColor(Color.parseColor("#ADFF2F"));
        b.setText("Start");
        b.setTextColor(Color.parseColor("#000000"));
        b.setId(1);

        Resources r=getResources();
        username=new TextView(this);
        username.setTextColor(Color.parseColor("#556B2F"));
        username.setWidth((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,400,r.getDisplayMetrics()));
        username.setTextSize(30);
        RelativeLayout.LayoutParams usernameParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        username.setId(ID);


        usernameParams.addRule(RelativeLayout.ABOVE,b.getId());
        usernameParams.addRule(RelativeLayout.CENTER_VERTICAL);
        usernameParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameParams.setMargins(0,0,0,50);


        int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        username.setWidth(px);

        RelativeLayout.LayoutParams buttonParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);

        pavansLayout.addView(username,usernameParams);
        pavansLayout.addView(b,buttonParams);
        setContentView(pavansLayout);

        b.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println(username.getText());
                        if((username.getText()).equals("u clicked it"))
                            username.setText("u re-clicked it");
                        else
                            username.setText("u clicked it");
                    }
                }
        );
        b.setOnLongClickListener(
                new Button.OnLongClickListener()
                {

                    @Override
                    public boolean onLongClick(View v) {
                        if((username.getText()).equals("that was a long one"))
                            username.setText("u re-clicked it long");
                        else
                            username.setText("that was a long one");
                        return true;
                    }
                }
        );
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        username.setText("this is single tap done");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        username.setText("this is double tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        username.setText("this is single tap");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        username.setText("this is onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        username.setText("this is onShowpress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        username.setText("this is on singleTapup");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {

        username.setText("this is onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        username.setText("this is onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        username.setText("this is Onflip");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
