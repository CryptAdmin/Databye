package com.cryptAdmin.databye.trigger.shortcut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.cryptAdmin.databye.Trigger
import com.cryptAdmin.databye.trigger.broadcast.BroadcastReceiver

class ShortcutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BroadcastReceiver.panic(this, intent, Trigger.SHORTCUT)
        finishAndRemoveTask()
    }
}