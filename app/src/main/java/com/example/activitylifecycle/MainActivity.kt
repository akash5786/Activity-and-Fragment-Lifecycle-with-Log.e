package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.e("Activity", "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.e("Activity", "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.e("Activity", "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Activity", "onStop()")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.e("Activity", "onSavedInstanceState()")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.e("Activity", "onDestroy()")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.e("Activity", "onRestart()")
        super.onRestart()
    }

}