package com.example.nayan.testandroidmaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by NAYAN on 10/27/2016.
 */
public class FragDemo extends Fragment {
    private View view;
    private TextView tv;

    public static FragDemo getInstance(int tabNo) {
        Bundle bundle = new Bundle();
        bundle.putInt("tabNo", tabNo);
        FragDemo fragDemo = new FragDemo();
        fragDemo.setArguments(bundle);
        return fragDemo;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_lay, container, false);
        tv = (TextView) view.findViewById(R.id.tv);
        tv.setText("Tab No :" + getArguments().getInt("tabNo"));
        return view;
    }
}
