package com.pengllrn.base.network.protocal

/**
 * 网络请求响应的回调接口。
 *
 * @author guolin
 * @since 17/2/12
 */
interface BaseCallback {

    fun onResponse(response: BaseResponse)

    fun onFailure(e: Exception)

}