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
public class pdec_bin_oct_hexFragment extends Fragment {


    public pdec_bin_oct_hexFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pdec_bin_oct_hex, container, false);

        TextView pdec_bin_oct_hex= view.findViewById(R.id.pdec_bin_oct_hex);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.pdec_bin_oct_hex);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                pdec_bin_oct_hex.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Convert into Dec, Bin, Oct and Hexa");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Python");
    }
}
