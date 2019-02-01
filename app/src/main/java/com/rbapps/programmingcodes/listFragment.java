package com.rbapps.programmingcodes;


import android.os.Bundle;
import android.support.annotation.NonNull;
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
public class listFragment extends Fragment {


    String[] C = {"Hello World", "Print an Integer", "Factorial", "Add Two Integers", "Multiply two Floating Point Numbers",
            "Prime Number", "Palindrome Number", "Swap Numbers", "Power of an Integer", "Prime Number between two Numbers", "Print Table",
            "Check Number is Even or Odd", "Check Number is Negative or Positive", "Leap Year", "Count Integer", "Largest Number", "Reverse an Integer",
            "Concatenation", "Check Alphabet", "Find Largest Number Using Array", "Find Largest Number Using Dynamic Memory Allocation"
            , "Find ASCII Value", "Calculator Using Switch", "Find the Frequency of Character in a String", "Sum of Natural Numbers",
            "Find the Size of int, float, double and char", "Check Whether a Character is Vowel or Consonant", "Binary to Octal", "Binary to Decimal",
            "Decimal to Octal", "Decimal to Binary", "Octal to Binary", "Octal to Decimal", "Half Pyramid", "Full Pyramid", "Store Information of a Student"};

    public listFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);


        ListView listC = view.findViewById(R.id.listC);
        ArrayAdapter<String> ArrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, C);
        listC.setAdapter(ArrayAdapter);
        listC.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment=null;
                if(position==0){
                    fragment = new helloFragment();
                }
                if(position==1){
                    fragment = new Print_intFragment();
                }
                if(position==2){
                    fragment = new FactorialFragment();
                }
                if(position==3){
                    fragment = new add_numFragment();
                }
                if(position==4){
                    fragment = new mul_numFragment();
                }
                if(position==5){
                    fragment = new primeFragment();
                }
                if(position==6){
                    fragment = new PalindromeFragment();
                }
                if(position==7){
                    fragment = new SwapFragment();
                }
                if(position==8){
                    fragment = new Power_intFragment();
                }
                if(position==9){
                    fragment = new PrimeFragment2();
                }
                if(position==10){
                    fragment = new Print_tableFragment();
                }
                if(position==11){
                    fragment = new Even_OddFragment();
                }
                if(position==12){
                    fragment = new Negative_PositiveFragment();
                }
                if(position==13){
                    fragment = new Leap_YearFragment();
                }
                if(position==14){
                    fragment = new Count_intFragment();
                }
                if(position==15){
                    fragment = new Largest_numFragment();
                }
                if(position==16){
                    fragment = new Reverse_intFragment();
                }
                if(position==17){
                    fragment = new ConcatenationFragment();
                }
                if(position==18){
                    fragment = new Check_AlphaFragment();
                }
                if(position==19){
                    fragment = new Largest_num_arrayFragment();
                }
                if(position==20){
                    fragment = new Large_num_dynamicFragment();
                }
                if(position==21){
                    fragment = new AsciiFragment();
                }
                if(position==22){
                    fragment = new CalculatorFragment();
                }
                if(position==23){
                    fragment = new Frequency_charFragment();
                }
                if(position==24){
                    fragment = new Sum_natFragment();
                }
                if(position==25){
                    fragment = new Size_varFragment();
                }
                if(position==26){
                    fragment = new Vowel_ConsonantFragment();
                }
                if(position==27){
                    fragment = new Binary_OctalFragment();
                }
                if(position==28){
                    fragment = new Binary_DecimalFragment();
                }
                if(position==29){
                    fragment = new Decimal_OctalFragment();
                }
                if(position==30){
                    fragment = new Decimal_BinaryFragment();
                }
                if(position==31){
                    fragment = new Octal_BinaryFragment();
                }
                if(position==32){
                    fragment = new Octal_DecimalFragment();
                }
                if(position==33){
                    fragment = new Half_pyramidFragment();
                }
                if(position==34){
                    fragment = new Full_PyramidFragment();
                }
                if(position==35){
                    fragment = new std_infoFragment();
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
        assert getActivity() != null;
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("C");
    }

    @Override
    public void onStop() {
        super.onStop();
        assert getActivity() != null;
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Programming Codes");
    }
}