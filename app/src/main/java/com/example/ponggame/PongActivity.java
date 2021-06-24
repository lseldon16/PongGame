package com.example.ponggame;


import android.app.Activity;
import android.view.Window;
//import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;



public class PongActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

       // getWindow().setFlags(WindowManager.LayoutParams.
              //  FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
}