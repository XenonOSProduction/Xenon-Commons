package com.commons.accespoint.xenon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.commons.accespoint.xenon.HelloWorld;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));
        HelloWorld.printLog("imchampagnepapi", "Hello From Android Lib");
    }
}
