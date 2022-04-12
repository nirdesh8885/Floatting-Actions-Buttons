package com.example.fab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionButton;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    //declaring objects
    public FloatingActionButton floatingActionButton;
    public FloatingActionButton floatingActionButton1;
    public FloatingActionButton floatingActionButton2;
    public FloatingActionButton floatingActionButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // apllying on click listner to do the action while clicking the button
        floatingActionButton =findViewById(R.id.facebook);
        floatingActionButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // providing the link of the website
                gotoUrl("https://www.facebook.com/");
            }
        });
        floatingActionButton1 =findViewById(R.id.instagram);
        floatingActionButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/accounts/login/?hl=en");
            }
        });

        floatingActionButton2 =findViewById(R.id.gmail);
        floatingActionButton2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                gotoUrl("https://mail.google.com/");
            }
        });

        floatingActionButton3 =findViewById(R.id.twitter);
        floatingActionButton3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/i/flow/login");
            }
        });



    }
      //creating the fuction to pass the links
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


}