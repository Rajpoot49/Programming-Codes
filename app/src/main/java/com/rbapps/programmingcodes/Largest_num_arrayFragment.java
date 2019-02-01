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
public class Largest_num_arrayFragment extends Fragment {

    private TextView large_num_array, output_large_num_array;

    public Largest_num_arrayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_largest_num_array, container, false);

        large_num_array= view.findViewById(R.id.large_num_array);
        output_large_num_array= view.findViewById(R.id.output_large_num_array);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.largest_number_of_an_array);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                large_num_array.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        String data1="";
        StringBuffer sbuffera= new StringBuffer();
        InputStream isa= this.getResources().openRawResource(R.raw.output_of_large_num_array);
        BufferedReader readera = new BufferedReader(new InputStreamReader(isa));

        if(isa!=null){
            try{
                while((data1= readera.readLine())!=null){
                    sbuffera.append(data1 +"\n");
                }
                output_large_num_array.setText(sbuffera);
                isa.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Large Num using Array");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C");
    }
}
