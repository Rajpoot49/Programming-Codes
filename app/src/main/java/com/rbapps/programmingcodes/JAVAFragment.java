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
public class JAVAFragment extends Fragment {

    String[] java= {"Hello World","Print an Integer","Add two Numbers","Multiply two Number","Even or Odd","Factorial of a Number","Prime Number",
            "Fibonacci Series","Palindrome Number","Print a Table","Power of a Number","Leap Year","Swap Numbers","Sum of Natural Numbers","Vowel or Consonant",
            "LCM","HCF","ASCII Code","Calculate Average using Array","Largest Among Three Numbers","Large Number Using Array","Reverse a Number",
            "Frequency of a Character in String","Calculator using Switch","Half Pyramid","Inverted Half Pyramid","Full Pyramid","Inverted Full Pyramid",
            "Binary to Decimal","Binary to Octal","Decimal to Binary","Decimal to Octal","Octal to Binary","Octal to Decimal"};

    public JAVAFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_java, container, false);

        ListView lstjava= view.findViewById(R.id.java);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,java);
        lstjava.setAdapter(adapter);
        lstjava.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment=null;
                if(position==0){
                    fragment= new JhelloFragment();
                }
                if(position==1){
                    fragment =new jprint_numFragment();
                }
                if(position==2){
                    fragment =new jadd_numFragment();
                }
                if(position==3){
                    fragment =new jmul_numFragment();
                }
                if(position==4){
                    fragment =new jeven_oddFragment();
                }
                if(position==5){
                    fragment =new jfactorialFragment();
                }
                if(position==6){
                    fragment =new jprimeFragment();
                }
                if(position==7){
                    fragment =new jfibonacciFragment();
                }
                if(position==8){
                    fragment =new jpalindromeFragment();
                }
                if(position==9){
                    fragment =new jprint_tableFragment();
                }
                if(position==10){
                    fragment =new jpower_numFragment();
                }
                if(position==11){
                    fragment =new jleap_yearFragment();
                }
                if(position==12){
                    fragment =new jswap_numFragment();
                }
                if(position==13){
                    fragment =new jsum_nat_numFragment();
                }
                if(position==14){
                    fragment =new jvwl_constFragment();
                }
                if(position==15){
                    fragment =new jlcmFragment();
                }
                if(position==16){
                    fragment =new jgcdFragment();
                }
                if(position==17){
                    fragment =new jasciiFragment();
                }
                if(position==18){
                    fragment =new javerage_arrayFragment();
                }
                if(position==19){
                    fragment =new jlarge_numFragment();
                }
                if(position==20){
                    fragment =new jlarge_array_numFragment();
                }
                if(position==21){
                    fragment =new jreverse_intFragment();
                }
                if(position==22){
                    fragment =new jfrequencyFragment();
                }
                if(position==23){
                    fragment =new jcalculatorFragment();
                }
                if(position==24){
                    fragment =new jhalf_pmdFragment();
                }
                if(position==25){
                    fragment =new jinverted_half_pmdFragment();
                }
                if(position==26){
                    fragment =new jfull_pmdFragment();
                }
                if(position==27){
                    fragment =new jinverted_full_pmdFragment();
                }
                if(position==28){
                    fragment =new jbin_decFragment();
                }
                if(position==29){
                    fragment =new jbin_octFragment();
                }
                if(position==30){
                    fragment =new jdec_binFragment();
                }
                if(position==31){
                    fragment =new jdec_octFragment();
                }
                if(position==32){
                    fragment =new joct_binFragment();
                }
                if(position==33){
                    fragment =new joct_decFragment();
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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Java");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Programming Codes");
    }
}
