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
public class CScount1Fragment extends Fragment {


    public CScount1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cscount1, container, false);

        TextView csoutput_count1=view.findViewById(R.id.csoutput_count1);
        TextView cscount1=view.findViewById(R.id.cscount1);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.cscount1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                cscount1.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        String data1="";
        StringBuffer sbuffera= new StringBuffer();
        InputStream isa= this.getResources().openRawResource(R.raw.csouput_count1);
        BufferedReader readera = new BufferedReader(new InputStreamReader(isa));

        if(isa!=null){
            try{
                while((data1= readera.readLine())!=null){
                    sbuffera.append(data1 +"\n");
                }
                csoutput_count1.setText(sbuffera);
                isa.close();
            }catch (Exception e){
                e.printStackTrace();}
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Count Number of 1's");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C#");
    }
}
