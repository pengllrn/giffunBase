package com.pengllrn.base.presenter.view

/**
 * Author：Pengllrn
 * Date: 2019/3/2
 */
interface BaseView {
    fun startLoading()

    fun loadFinished()

    fun loadFailed(msg: String?)
}