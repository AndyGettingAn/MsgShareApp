package com.example.kotlin.msgshareapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Kotlin Code

        var nums : IntRange = 1..5

        for (a in nums)
            println(2)


    }

}
