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
public class CSsum_bin_numFragment extends Fragment {


    public CSsum_bin_numFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cssum_bin_num, container, false);

        TextView cssum_bin_num=view.findViewById(R.id.cssum_bin_num);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.cssum_bin_num);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                cssum_bin_num.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        TextView csoutput_sum_bin_num=view.findViewById(R.id.csoutput_sum_bin_num);
        String dataa="";
        StringBuffer sbuffera= new StringBuffer();
        InputStream isa= this.getResources().openRawResource(R.raw.output_cssum_bin_num);
        BufferedReader readera = new BufferedReader(new InputStreamReader(isa));

        if(isa!=null){
            try{
                while((dataa= readera.readLine())!=null){
                    sbuffera.append(dataa +"\n");
                }
                csoutput_sum_bin_num.setText(sbuffera);
                isa.close();
            }catch (Exception e){
                e.printStackTrace();}
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Sum of Binary Numbers");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C#");
    }
}
