package com.example.staticbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class LocalChangedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

       Log.d("RCV","LOCALE")
        Toast.makeText(context,"language Changed",Toast.LENGTH_SHORT).show()
        context.startActivity(Intent(
            context,
            MainActivity::class.java
        ))
    }
}