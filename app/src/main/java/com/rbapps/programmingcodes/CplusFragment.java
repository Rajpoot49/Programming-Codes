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
public class CplusFragment extends Fragment {

    String[] Cplus = {"Hello World", "Print an Integer", "Add two Integers", "Multiply two Integers", "Power of a Number", "Print Table", "Prime Number",
            "Factorial of a Number", "Palindrome Number", "Armstrong Number", "Number is Even or Odd", "Calculate Average of Numbers Using Arrays",
            "Swap Numbers", "Calculate Sum of Natural Numbers", "Leap Year", "Largest Number", "Largest Number using Array", "ASCII Code","LCM",
            "Concatenate Strings","Reverse an Integer","Vowel or Consonant","Size of Variables","Reverse a sentence using recursion","Calculator using Switch",
            "HCF","Half Pyramid","Inverted Half Pyramid","Full Pyramid","Full Inverted Pyramid","Binary to Decimal","Binary to Octal","Decimal to Octal",
            "Decimal to Binary","Octal to Decimal","Octal to Binary","Store Information of a Student"};

    public CplusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cplus, container, false);

        ListView cplus= view.findViewById(R.id.Cplus);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,Cplus);
        cplus.setAdapter(adapter);
        cplus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment=null;
                if(position==0){
                    fragment= new CPhelloFragment();
                }
                if(position==1){
                    fragment= new CPprint_numFragment();
                }
                if(position==2){
                    fragment= new CPadd_nuimFragment();
                }
                if(position==3){
                    fragment= new CPmullFragment();
                }
                if(position==4){
                    fragment= new CPpowerFragment();
                }
                if(position==5){
                    fragment= new CPprint_tableFragment();
                }
                if(position==6){
                    fragment= new CPprime_umFragment();
                }
                if(position==7){
                    fragment= new CPfactorialFragment();
                }
                if(position==8){
                    fragment= new CPpalindromeFragment();
                }
                if(position==9){
                    fragment= new CParmstrongFragment();
                }
                if(position==10){
                    fragment= new CPeven_oddFragment();
                }
                if(position==11){
                    fragment= new CPaverage_numFragment();
                }
                if(position==12){
                    fragment= new CPswap_numFragment();
                }
                if(position==13){
                    fragment= new CPsum_nat_numFragment();
                }
                if(position==14){
                    fragment= new CPleap_yearFragment();
                }
                if(position==15){
                    fragment= new CPlarge_numFragment();
                }
                if(position==16){
                    fragment= new CPlarge_num_arrayFragment();
                }
                if(position==17){
                    fragment= new CPasciiFragment();
                }
                if(position==18){
                    fragment= new CPlcmFragment();
                }
                if(position==19){
                    fragment= new CPconcatenateFragment();
                }
                if(position==20){
                    fragment= new CPreverse_intFragment();
                }
                if(position==21){
                    fragment= new CPvowl_constFragment();
                }
                if(position==22){
                    fragment= new CPsize_varFragment();
                }
                if(position==23){
                    fragment= new CPreverse_sentFragment();
                }
                if(position==24){
                    fragment= new CPcalculatorFragment();
                }
                if(position==25){
                    fragment= new CPgcdFragment();
                }
                if(position==26){
                    fragment= new CPhalf_pyramidFragment();
                }
                if(position==27){
                    fragment= new CPhalf_int_pmdFragment();
                }
                if(position==28){
                    fragment= new CPfull_pyramidFragment();
                }
                if(position==29){
                    fragment= new CPfull_int_pmdFragment();
                }
                if(position==30){
                    fragment= new CPbin_decFragment();
                }
                if(position==31){
                    fragment= new CPbin_octFragment();
                }
                if(position==32){
                    fragment= new CPdec_octFragment();
                }
                if(position==33){
                    fragment= new CPdec_binFragment();
                }
                if(position==34){
                    fragment= new CPoct_decFragment();
                }
                if(position==35){
                    fragment= new CPoct_binFragment();
                }
                if(position==36){
                    fragment= new CPstore_info_stdFragment();
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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C++");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Programming Codes");
    }
}
