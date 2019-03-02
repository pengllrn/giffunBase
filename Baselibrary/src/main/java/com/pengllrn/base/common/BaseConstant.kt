package com.pengllrn.base.common

/**
 * 项目所有全局通用常量的管理类。
 * Author：Pengllrn
 * Date: 2019/3/2
 */
object BaseConstant {
    var isDebug: Boolean = false

    val BASE_URL = if (isDebug) "http://192.168.31.177:3000" else "http://api.quxianggif.com"


}