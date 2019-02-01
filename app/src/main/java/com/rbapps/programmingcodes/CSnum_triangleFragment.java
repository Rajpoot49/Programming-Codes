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
public class CSnum_triangleFragment extends Fragment {


    public CSnum_triangleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_csnum_triangle, container, false);

        TextView csnum_tri=view.findViewById(R.id.csnum_tri);
        String data="";
        StringBuffer sbuffer= new StringBuffer();
        InputStream is= this.getResources().openRawResource(R.raw.csdisplay_num_triangle);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is!=null){
            try{
                while((data= reader.readLine())!=null){
                    sbuffer.append(data +"\n");
                }
                csnum_tri.setText(sbuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        TextView csoutput_num_tri=view.findViewById(R.id.csoutput_num_tri);
        String data1="";
        StringBuffer sbuffera= new StringBuffer();
        InputStream isa= this.getResources().openRawResource(R.raw.outputdisplay_num_triangle);
        BufferedReader readera = new BufferedReader(new InputStreamReader(isa));

        if(is!=null){
            try{
                while((data1= readera.readLine())!=null){
                    sbuffera.append(data1 +"\n");
                }
                csoutput_num_tri.setText(sbuffera);
                isa.close();
            }catch (Exception e){
                e.printStackTrace();}
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Number in the form of triangle");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C#");
    }
}
