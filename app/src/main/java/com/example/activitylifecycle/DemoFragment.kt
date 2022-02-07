package com.example.activitylifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class DemoFragment : Fragment() {

    override fun onAttach(context: Context) {
        Log.e("Fragment","onAttach()")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("Fragment","onCreate()")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_demo,container,false)
        Log.e("Fragment","onCreateView()")
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.e("Fragment","onActivityCreated()")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.e("Fragment","onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.e("Fragment","onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.e("Fragment","onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Fragment","onStop()")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.e("Fragment","onSavedInstanceState()")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.e("Fragment","onDestroyView()")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("Fragment","onDestroy()")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("Fragment","onDetach()")
        super.onDetach()
    }
}