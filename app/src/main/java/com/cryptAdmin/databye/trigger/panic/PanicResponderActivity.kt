package com.cryptAdmin.databye.trigger.panic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import info.guardianproject.panic.Panic
import info.guardianproject.panic.PanicResponder
import com.cryptAdmin.databye.Trigger
import com.cryptAdmin.databye.Utils

class PanicResponderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!Panic.isTriggerIntent(intent)) {
            finishAndRemoveTask()
            return
        }
        Utils(this).fire(
            Trigger.PANIC_KIT,
            PanicResponder.receivedTriggerFromConnectedApp(this),
        )
        finishAndRemoveTask()
    }
}