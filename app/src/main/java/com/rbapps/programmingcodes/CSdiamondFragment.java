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
public class CSdiamondFragment extends Fragment {


    public CSdiamondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_csdiamond, container, false);

        TextView csdiamond=view.findViewById(R.id.csdiamond);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.csdiamond);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                csdiamond.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        TextView csoutput_diamond=view.findViewById(R.id.csoutput_diamond);
        String dataa="";
        StringBuffer sbuffera= new StringBuffer();
        InputStream isa= this.getResources().openRawResource(R.raw.csoutput_diamond);
        BufferedReader readera = new BufferedReader(new InputStreamReader(isa));

        if(isa!=null){
            try{
                while((dataa= readera.readLine())!=null){
                    sbuffera.append(dataa +"\n");
                }
                csoutput_diamond.setText(sbuffera);
                isa.close();
            }catch (Exception e){
                e.printStackTrace();}
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Diamond Pattern");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C#");
    }
}
