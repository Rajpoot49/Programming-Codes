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

import com.rbapps.taleem.padd_numFragment;
import com.rbapps.taleem.phelloFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class PythonFragment extends Fragment {

    String[] Python={"Hello World","Add two Number","Check if the input number is odd or even","Find largest even and largest odd number from user input",
    "Find the Factorial","Print Fibonacci Series","Find the Prime number","Check Armstrong Number","Generate a random number between 0 and 9","Print Table",
    "Find ASCII Value","Leap Year","Swap two Variables","Find the Largest Num","Check if a string is palindrome or not","Find the LCM","Find GCD or HCF",
            "Count the number of vowels in a string","Check whether a entered number is zero,negative or positive","Find the sum of Natural numbers",
            "Convert decimal number into binary,octal and hexadecimal","Simple Calculator","Find the sum of cosine","Find the sum of Sine",
            "Calculate the Square root","Add two Matrices","Count the number of Uppercase and Lowercase letters in a string","Remove Punctuations form a string"};

    public PythonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_python, container, false);

        ListView pythonlist= view.findViewById(R.id.python);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,Python);
        pythonlist.setAdapter(adapter);
        pythonlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment=null;
                if(position==0){
                    fragment= new phelloFragment();
                }
                if(position==1){
                    fragment= new padd_numFragment();
                }
                if(position==2){
                    fragment= new peven_oddFragment();
                }
                if(position==3){
                    fragment= new plarge_even_oddFragment();
                }
                if(position==4){
                    fragment= new pfactorial_Fragment();
                }
                if(position==5){
                    fragment= new pfibonacci_Fragment();
                }
                if(position==6){
                    fragment= new pprime_Fragment();
                }
                if(position==7){
                    fragment= new parmstrong_Fragment();
                }
                if(position==8){
                    fragment= new prandom_Fragment();
                }
                if(position==9){
                    fragment= new ptable_Fragment();
                }
                if(position==10){
                    fragment= new pascii_Fragment();
                }
                if(position==11){
                    fragment= new pleap_yearFragment();
                }
                if(position==12){
                    fragment= new pswap_varFragment();
                }
                if(position==13){
                    fragment= new plarge_numFragment();
                }
                if(position==14){
                    fragment= new ppalindrome_strFragment();
                }
                if(position==15){
                    fragment= new plcm_Fragment();
                }
                if(position==16){
                    fragment = new pgcd_Fragment();
                }
                if(position==17){
                    fragment= new pvwl_strFragment();
                }
                if(position==18){
                    fragment= new pchck_numFragment();
                }
                if(position==19){
                    fragment =new psum_nat_numFragment();
                }
                if(position==20){
                    fragment= new pdec_bin_oct_hexFragment();
                }
                if(position==21){
                    fragment= new pcalculator_Fragment();
                }
                if(position==22){
                    fragment= new pcosine_Fragment();
                }
                if(position==23){
                    fragment= new psine_Fragment();
                }
                if(position==24){
                    fragment = new psq_root_Fragment();
                }
                if(position==25){
                    fragment= new padd_matrixFragment();
                }
                if(position==26){
                    fragment= new pcount_upper_lower_Fragment();
                }
                if(position==27){
                    fragment= new prem_punc_Fragment();
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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Python");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Programming Codes");
    }

}
