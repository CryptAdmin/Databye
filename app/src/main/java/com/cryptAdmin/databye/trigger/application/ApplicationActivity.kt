package com.cryptAdmin.databye.trigger.application

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.cryptAdmin.databye.Trigger
import com.cryptAdmin.databye.Utils

class ApplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils(this).fire(Trigger.APPLICATION)
        finishAndRemoveTask()
    }
}