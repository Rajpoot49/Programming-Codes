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
public class plarge_even_oddFragment extends Fragment {


    public plarge_even_oddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_plarge_even_odd, container, false);

        TextView plarge_even_odd= view.findViewById(R.id.plarge_even_odd);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.plarge_even_odd);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                plarge_even_odd.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        TextView output_plarge_even_odd= view.findViewById(R.id.output_plarge_even_odd);
        String data1="";
        StringBuffer sbuffer1= new StringBuffer();
        InputStream is1= this.getResources().openRawResource(R.raw.ouput_plarge_even_odd);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(is1));

        if(is1!=null){
            try{
                while((data1= reader1.readLine())!=null){
                    sbuffer1.append(data1 +"\n");
                }
                output_plarge_even_odd.setText(sbuffer1);
                is1.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Find the Largest even & Odd number in user's input");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Python");
    }
}
