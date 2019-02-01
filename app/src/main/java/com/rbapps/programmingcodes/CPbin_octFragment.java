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
public class CPbin_octFragment extends Fragment {


    public CPbin_octFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cpbin_oct, container, false);

        TextView cbinary_to_octal=view.findViewById(R.id.cbinary_to_octal);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.cbinary_to_octal);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                cbinary_to_octal.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Binary to Octal");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C++");
    }
}
