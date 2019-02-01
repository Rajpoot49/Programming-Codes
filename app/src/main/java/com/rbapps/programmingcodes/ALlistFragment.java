package com.rbapps.programmingcodes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ALlistFragment extends Fragment {

    String[] al={"Hello World","Read a Character from keyboard","Print Counting 0-9","Display Character","ADD 32-bit Numbers","Reverse Input","Palindrome",
            "Convert Lower Case into Upper Case","Convert Upper Case into Lower Case","String Length","Compare Strings","Print all 256 ASCII characters",
            "Print Upper and Lower Case Letter","Print First and Last Letter of String","Calculator","Convert Hexadecimal to Binary","Print String Center of Screen",
            "Display a solid 10*10 box of asterike","Print Color Character","Solve ax + b","Current Time of your system","Thermometer"};


    public ALlistFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_allist, container, false);

        ListView allist=view.findViewById(R.id.allist);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,al);
        allist.setAdapter(adapter);
        allist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment= null;
                if(position==0){
                    fragment= new ALhelloFragment();
                }
                if(position==1){
                    fragment= new ALread_charFragment();
                }
                if(position==2){
                    fragment= new ALcountFragment();
                }
                if(position==3){
                    fragment= new ALdisplay_charFragment();
                }
                if(position==4){
                    fragment= new ALadd_numFragment();
                }
                if(position==5){
                    fragment= new ALreverse_strFragment();
                }
                if(position==6){
                    fragment= new ALpalindromeFragment();
                }

                if(position==7){
                    fragment= new ALlower_upperFragment();
                }
                if(position==8){
                    fragment= new ALupper_lowerFragment();
                }
                if(position==9){
                    fragment= new ALstring_lengthFragment();
                }
                if(position==10){
                    fragment= new ALcomp_strFragment();
                }
                if(position==11){
                    fragment= new ALasciiFragment();
                }
                if(position==12){
                    fragment= new ALprint_u_lFragment();
                }
                if(position==13){
                    fragment= new ALfirst_lastFragment();
                }
                if(position==14){
                    fragment= new ALcalculatorFragment();
                }
                if(position==15){
                    fragment= new ALhex_binFragment();
                }
                if(position==16){
                    fragment= new ALcenter_stringFragment();
                }
                if(position==17){
                    fragment= new ALasterik_Fragment();
                }
                if(position==18){
                    fragment= new ALcolor_charFragment();
                }
                if(position==19){
                    fragment= new ALax_bFragment();
                }
                if(position==20){
                    fragment= new ALcurrent_timeFragment();
                }
                if(position==21){
                    fragment= new ALthermometer_Fragment();
                }
                if(fragment!=null){
                    FragmentManager fragmentManager= getFragmentManager();
                    assert fragmentManager != null;
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Assembly Language");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Programming Codes");
    }
}
