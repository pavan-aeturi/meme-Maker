package com.example.mememaker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class lower_fragment extends Fragment {
    private  static TextView Top;
    private static TextView Bottom;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.lowerfragment,container,false);
        Top=(TextView)view.findViewById(R.id.Top);
        Bottom=(TextView)view.findViewById(R.id.Bottom);        return view;
    }
    public void setMeme(String s1, String s2) {
        Top.setText(s1);
        Bottom.setText(s2);
    }
}
