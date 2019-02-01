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
public class Large_num_dynamicFragment extends Fragment {

    private TextView output_large_num_dynamic, large_num_dynamic;

    public Large_num_dynamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_large_num_dynamic, container, false);
        output_large_num_dynamic= view.findViewById(R.id.output_large_num_dynamic);
        large_num_dynamic=view.findViewById(R.id.large_num_dynamic);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.large_number_using_dynamic);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                large_num_dynamic.setText(sbuffer);
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
                output_large_num_dynamic.setText(sbuffera);
                isa.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Large num using Dynamic Memory Allocation");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C");
    }
}
