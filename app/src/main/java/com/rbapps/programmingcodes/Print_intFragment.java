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
public class Print_intFragment extends Fragment {

    private TextView print_number;
    public Print_intFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_print_int, container, false);
        print_number=view.findViewById(R.id.print_number);
        String data = "";
        StringBuffer sbuffer = new StringBuffer();
        InputStream is = this.getResources().openRawResource(R.raw.printaninteger);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if (is != null) {
            try {
                while ((data = reader.readLine()) != null) {
                    sbuffer.append(data + "\n");
                }
                print_number.setText(sbuffer);
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Print an Integer");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C");
    }
}