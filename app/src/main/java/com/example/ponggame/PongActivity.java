package com.example.ponggame;


import android.app.Activity;
import android.view.Window;
import android.os.Bundle;
import android.graphics.Point;
import android.view.Display;



public class PongActivity extends Activity
{
    private PongGame mPongGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

       // getWindow().setFlags(WindowManager.LayoutParams.
              //  FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        //initialize pong game, passing things into constructor
        //this is reference to PongActivity
        mPongGame = new PongGame(this, size.x, size.y);
        setContentView(mPongGame);

    }





    @Override
    protected void onResume()
    {
        super.onResume();

        // More code here later in the chapter
        mPongGame.resume();

    }


    @Override
    protected void onPause()
    {
        super.onPause();

        // More code here later in the chapter
        mPongGame.pause();
    }



}