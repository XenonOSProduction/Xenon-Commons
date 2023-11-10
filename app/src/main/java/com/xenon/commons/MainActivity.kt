package com.xenon.commons

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xenon.commons.accesspoint.Point
import com.xenon.commons.accesspoint.calculateDistanceTo


class MainActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val point1 = Point(1.0, 1.0)
        val point2 = Point(10.0, 1.0)
        val result = point1.calculateDistanceTo(point2)
        println("Distance from point1 to point2 is $result")
    }
}

