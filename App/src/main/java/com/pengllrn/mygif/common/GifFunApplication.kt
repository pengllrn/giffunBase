package com.pengllrn.mygif.common

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import com.pengllrn.base.common.AppContext

/**
 * Author：Pengllrn
 * Date: 2019/3/2
 */
open class GifFunApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppContext.initialize(this)
//        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, null)
//        MobclickAgent.setCatchUncaughtExceptions(false) // 关闭友盟的崩溃采集功能，使用腾讯Bugly
//        LitePal.initialize(this)
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this) //Android分包方案multidex
    }

}