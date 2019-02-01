package com.rbapps.programmingcodes;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.rbapps.taleem.Privacy_Policy;


public class MainActivity extends AppCompatActivity {

    LinearLayout tv,assemblylang,Cplus,Java,CSharp,Python;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Programming Codes");

        tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listFragment fragment= null;
                fragment= new listFragment();
                if(fragment!=null){
                    FragmentManager fragmentManager= getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });
        assemblylang=findViewById(R.id.tv4);
        assemblylang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ALlistFragment fragment= null;
                fragment= new ALlistFragment();
                if(fragment!=null){
                    FragmentManager fragmentManager= getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });

        Cplus=findViewById(R.id.tv1);
        Cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CplusFragment fragment=null;
                fragment=new CplusFragment();
                if(fragment!=null){
                    FragmentManager fragmentManager= getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });

        Java=findViewById(R.id.tv3);
        Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JAVAFragment fragment=null;
                fragment=new JAVAFragment();
                if(fragment!=null){
                    FragmentManager fragmentManager= getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });

        CSharp=findViewById(R.id.tv5);
        CSharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CSharpFragment fragment=null;
                fragment= new CSharpFragment();
                if(fragment!=null){
                    FragmentManager fragmentManager= getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout,fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });

     Python= findViewById(R.id.tv6);
     Python.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             PythonFragment fragment= null;
             fragment = new PythonFragment();
             if(fragment!=null){
                 FragmentManager fragmentManager= getSupportFragmentManager();
                 FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                 fragmentTransaction.replace(R.id.mainLayout,fragment);
                 fragmentTransaction.addToBackStack(null);
                 fragmentTransaction.commit();
             }
         }
     });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.privacy:
                Intent privacy = new Intent(this, Privacy_Policy.class);
                startActivity(privacy);
                break;
            case R.id.about_id:
                Intent about = new
                        Intent(this, about.class);
                startActivity(about);
                break;
            case R.id.rate_id:
                Intent mrate= new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.rbapps.taleem"));
                startActivity(mrate);
                return true;
            default:
        }
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        getSupportActionBar().setTitle("Programming Codes");
    }
    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().setTitle("Programming Codes");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        getSupportActionBar().setTitle("Programming Codes");
    }

}
