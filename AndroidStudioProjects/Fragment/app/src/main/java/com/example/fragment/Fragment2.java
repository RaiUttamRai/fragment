package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    View view;
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle b){
         view = layoutInflater.inflate(R.layout.fragment2,container,false);

        return view;
    }
}
