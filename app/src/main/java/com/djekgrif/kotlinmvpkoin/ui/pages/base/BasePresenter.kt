package com.djekgrif.kotlinmvpkoin.ui.pages.base

interface BasePresenter<V : BaseView> {
    val view: V
    fun subscribe(){}
    fun unSubscribe(){}
}