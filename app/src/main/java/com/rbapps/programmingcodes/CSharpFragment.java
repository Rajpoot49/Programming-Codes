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
public class CSharpFragment extends Fragment {

    String[] CSharp= {"Hello World","Add two Numbers","Multiply two Numbers","Even or Odd","Factorial of a Number","Fibonacci Series",
    "Armstrong Number","Find and Display the H.C.F","Find Magnitude of a integer","Display Factors of the number","Check the entered number is 0, Negative or Positive"
    ,"Read a grade & display equivalent Description","Palindrome Number","Leap Year","Find Min & Max Numbers","Count Number of 1's in Number","Swap two Numbers",
    "Prime Numbers b/w 1-100","Average for the set of values","Calculator","Calculate Acceleration","Sum of N numbers","Display the sum of digits entered by user",
    "Greatest Number","Generate Random Numbers","Display Square Feet of a house","Display Date in different formats","Find a number using Pythagoras Theorem",
    "Display number in the form of triangle","Calculate the value of sinѲ","Calculate the value of cosѲ","Display Binary Triangle","Perform Unboxing Operation",
    "Binary to Decimal","Decimal to Binary","Decimal to Octal","Decimal to Hexadecimal","Hexadecimal to Decimal","Diamond Pattern","Sum of two Binary Numbers",
    "Sort a List of Names in Alphabetical Order","Single Inheritance","Multilevel Inheritance","Hierarchical Inheritance"};

    public CSharpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_csharp, container, false);

        ListView CPList= view.findViewById(R.id.CSharp);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,CSharp);
        CPList.setAdapter(adapter);
        CPList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment=null;
                if(position==0){
                    fragment= new CShelloFragment();
                }
                if(position==1){
                    fragment= new CSadd_numFragment();
                }
                if(position==2){
                    fragment= new CSmul_numFragment();
                }
                if(position==3){
                    fragment= new CSeven_oddFragment();
                }
                if(position==4){
                    fragment= new CSfactorialFragment();
                }
                if(position==5){
                    fragment= new CSfibonacciFragment();
                }
                if(position==6){
                    fragment= new CSarmstrongFragment();
                }
                if(position==7){
                    fragment= new CShcfFragment();
                }
                if(position==8){
                    fragment= new CSint_magnitudeFragment();
                }
                if(position==9){
                    fragment= new CSdisplay_factorFragment();
                }
                if(position==10){
                    fragment= new CSdisplay_numFragment();
                }
                if(position==11){
                    fragment= new CSgrade_displayFragment();
                }
                if(position==12){
                    fragment= new CSpalindromeFragment();
                }
                if(position==13){
                    fragment= new CSleap_yearFragment();
                }
                if(position==14){
                    fragment= new CSmin_maxFragment();
                }
                if(position==15){
                    fragment= new CScount1Fragment();
                }
                if(position==16){
                    fragment= new CSswap_numFragment();
                }
                if(position==17){
                    fragment= new CSprime_numFragment();
                }
                if(position==18){
                    fragment= new CSaverage_arrayFragment();
                }
                if(position==19){
                    fragment= new CScalculatorFragment();
                }
                if(position==20){
                    fragment= new CScal_acelFragment();
                }
                if(position==21){
                    fragment= new CSsum_n_numFragment();
                }
                if(position==22){
                    fragment= new CSnum_sumFragment();
                }
                if(position==23){
                    fragment= new CSgreatest_numFragment();
                }
                if(position==24){
                    fragment= new CSrandom_numFragment();
                }
                if(position==25){
                    fragment= new CSsq_houseFragment();
                }
                if(position==26){
                    fragment= new CSdate_formatFragment();
                }
                if(position==27){
                    fragment= new CSpytha_theoremFragment();
                }
                if(position==28){
                    fragment= new CSnum_triangleFragment();
                }
                if(position==29){
                    fragment= new CSsinxFragment();
                }
                if(position==30){
                    fragment= new CScosxFragment();
                }
                if(position==31){
                    fragment= new CSbin_triFragment();
                }
                if(position==32){
                    fragment= new CSunboxing_opFragment();
                }
                if(position==33){
                    fragment= new CSbin_decFragment();
                }
                if(position==34){
                    fragment= new CSdec_binFragment();
                }
                if(position==35){
                    fragment= new CSdec_octFragment();
                }
                if(position==36){
                    fragment= new CSdec_hexFragment();
                }
                if(position==37){
                    fragment= new CShex_decFragment();
                }
                if(position==38){
                    fragment= new CSdiamondFragment();
                }
                if(position==39){
                    fragment= new CSsum_bin_numFragment();
                }
                if(position==40){
                    fragment= new CSsort_alphaFragment();
                }
                if(position==41){
                    fragment= new CSsingle_inherFragment();
                }
                if(position==42){
                    fragment= new CSmulti_inherFragment();
                }
                if(position==43){
                    fragment= new CShierar_inherFragment();
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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C#");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Programming Codes");
    }
}
