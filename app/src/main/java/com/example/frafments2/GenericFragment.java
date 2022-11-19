package com.example.frafments2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GenericFragment extends Fragment {
    private int backgroundColor;
    private String title;
    private static final String FRAGMENT_COLOR="FRAGMENT_COLOR";
    private static final String FRAGMENT_TITLE="FRAGMENT_TITLE";

    public static GenericFragment newInstance(int color, String data){
        GenericFragment fragment =new GenericFragment();
        Bundle bundle=new Bundle();
        bundle.putInt(FRAGMENT_COLOR,color);
        bundle.putString(FRAGMENT_TITLE, data);
        fragment.setArguments(bundle);
        return fragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            if (bundle.containsKey(FRAGMENT_TITLE)) {
                title = bundle.getString(FRAGMENT_TITLE);

            }
            if (bundle.containsKey(FRAGMENT_COLOR)) {
                backgroundColor = bundle.getInt(FRAGMENT_COLOR);

            }


        }
    }

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_generic,container, false);
        RelativeLayout relativeLayout=(RelativeLayout) view.findViewById(R.id.relative);
        TextView textView =(TextView) view.findViewById(R.id.text);
        relativeLayout.setBackgroundColor(backgroundColor);
        textView.setText(title);
        return view;
    }
}
