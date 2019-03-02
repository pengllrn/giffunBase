package com.pengllrn.mygif.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pengllrn.mygif.R

class MainActivity : AppCompatActivity() {
    companion object {

        private const val TAG = "MainActivity"

        private const val REQUEST_SEARCH = 10000

        fun actionStart(activity: Activity) {
            val intent = Intent(activity, MainActivity::class.java)
            activity.startActivity(intent)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
