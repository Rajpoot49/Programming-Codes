package com.rbapps.programmingcodes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView fb=findViewById(R.id.fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Browseintent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100005614360444"));
                startActivity(Browseintent);
            }
        });

        ImageView gmail= findViewById(R.id.gmail);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Browseintent1= new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/100251791095880484030"));
                startActivity(Browseintent1);
            }
        });
        ImageView fb1= findViewById(R.id.fb1);
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Browseintent2= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sheikh.zada.35912672?lst=100005614360444%3A100007747170835%3A1519846225"));
                startActivity(Browseintent2);
            }
        });

        ImageView gmail1= findViewById(R.id.gmail1);
        gmail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Browseintent3= new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/100251791095880484030"));
                startActivity(Browseintent3);
            }
        });

    }
}
