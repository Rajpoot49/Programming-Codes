package com.rbapps.programmingcodes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class CPsize_varFragment extends Fragment {


    public CPsize_varFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cpsize_var, container, false);

        TextView csize_var=view.findViewById(R.id.csize_var);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.csize_of_var);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                csize_var.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Size of a variable");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C++");
    }
}
