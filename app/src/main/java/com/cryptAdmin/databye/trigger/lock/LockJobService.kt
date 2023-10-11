package com.cryptAdmin.databye.trigger.lock

import android.app.job.JobParameters
import android.app.job.JobService

import com.cryptAdmin.databye.Trigger
import com.cryptAdmin.databye.Utils

class LockJobService : JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {
        Utils(this).fire(Trigger.LOCK)
        return false
    }

    override fun onStopJob(params: JobParameters?): Boolean { return true }
}