package com.example.mememaker;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class upper_fragment extends Fragment {

    private static EditText TopTextInput;
    private static EditText BottomTextInput;
    TopSectionListener activityCommander;
    public interface TopSectionListener{
        public void createMeme(String s1,String s2);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander=(TopSectionListener)activity;
        }
        catch(ClassCastException e)
        {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.upperfragment,container,false);
        TopTextInput=(EditText)view.findViewById(R.id.top);
        BottomTextInput=(EditText)view.findViewById(R.id.bottom);
        final Button b=(Button)view.findViewById(R.id.button);
        b.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }
    public void buttonClicked(View v)
    {
            activityCommander.createMeme(TopTextInput.getText().toString(),BottomTextInput.getText().toString());
            TopTextInput.setText("");
            BottomTextInput.setText("");
    }
}
