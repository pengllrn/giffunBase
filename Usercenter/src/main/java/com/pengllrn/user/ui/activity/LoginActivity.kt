package com.pengllrn.user.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.pengllrn.base.common.AppContext
import com.pengllrn.base.model.Version
import com.pengllrn.user.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    companion object {

        private const val TAG = "LoginActivity"

        @JvmStatic val START_WITH_TRANSITION = "start_with_transition"

        @JvmStatic val INTENT_HAS_NEW_VERSION = "intent_has_new_version"

        @JvmStatic val INTENT_VERSION = "intent_version"

        private val ACTION_LOGIN = "${AppContext.getPackageName()}.ACTION_LOGIN"

        private val ACTION_LOGIN_WITH_TRANSITION = "${AppContext.getPackageName()}.ACTION_LOGIN_WITH_TRANSITION"

        /**
         * 启动LoginActivity。
         *
         * @param activity
         *          原Activity的实例
         * @param hasNewVersion
         *          是否存在版本更新。
         *
         */
        fun actionStart(activity: Activity, hasNewVersion: Boolean, version: Version?) {
            val intent = Intent(ACTION_LOGIN).apply {
                putExtra(INTENT_HAS_NEW_VERSION, hasNewVersion)
                putExtra(INTENT_VERSION, version)
            }
            activity.startActivity(intent)
        }

        /**
         * 启动LoginActivity，并附带Transition动画。
         *
         * @param activity
         * 原Activity的实例
         * @param logo
         * 要执行transition动画的控件
         */
        fun actionStartWithTransition(activity: Activity, logo: View, hasNewVersion: Boolean, version: Version?) {
            val intent = Intent(ACTION_LOGIN_WITH_TRANSITION).apply {
                putExtra(INTENT_HAS_NEW_VERSION, hasNewVersion)
                putExtra(INTENT_VERSION, version)
            }
//            if (AndroidVersion.hasLollipop()) {
//                intent.putExtra(START_WITH_TRANSITION, true)
//                val options = ActivityOptions.makeSceneTransitionAnimation(activity, logo,
//                    activity.getString(R.string.transition_logo_splash))
//                activity.startActivity(intent, options.toBundle())
//            } else {
//                activity.startActivity(intent)
//                activity.finish()
//            }
        }
    }
}
