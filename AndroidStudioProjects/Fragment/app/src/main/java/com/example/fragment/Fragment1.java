package com.example.fragment;

//import static android.view.View.inflate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

//import java.util.zip.Inflater;

public class Fragment1 extends Fragment {
    View view;
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle b){
        //View inflater = null;
        view =layoutInflater.inflate(R.layout.fragment1,container,false);
        return view;
    }
}
