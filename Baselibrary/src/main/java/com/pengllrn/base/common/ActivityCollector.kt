package com.pengllrn.base.common

import android.app.Activity
import com.pengllrn.base.extension.logDebug
import java.lang.ref.WeakReference

object ActivityCollector {

    private const val TAG = "ActivityCollector"

    private val activityList = ArrayList<WeakReference<Activity>?>()

    fun size(): Int {
        return activityList.size
    }

    fun add(weakRefActivity: WeakReference<Activity>?) {
        activityList.add(weakRefActivity)
    }

    fun remove(weakRefActivity: WeakReference<Activity>?) {
        val result = activityList.remove(weakRefActivity)
        logDebug(TAG, "remove activity reference $result")
    }

    fun finishAll() {
        if (activityList.isNotEmpty()) {
            for (activityWeakReference in activityList) {
                val activity = activityWeakReference?.get()
                if (activity != null && !activity.isFinishing) {
                    activity.finish()
                }
            }
            activityList.clear()
        }
    }

}