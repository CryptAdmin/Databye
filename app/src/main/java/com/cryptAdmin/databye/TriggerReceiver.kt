package com.cryptAdmin.databye

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class TriggerReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        com.cryptAdmin.databye.trigger.broadcast.BroadcastReceiver().onReceive(context, intent)
    }
}