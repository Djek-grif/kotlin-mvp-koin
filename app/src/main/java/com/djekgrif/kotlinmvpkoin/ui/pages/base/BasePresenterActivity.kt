package com.djekgrif.kotlinmvpkoin.ui.pages.base

abstract class BasePresenterActivity<P : BasePresenter<*>>: BaseActivity() {

    abstract val presenter: P

    override fun onStart() {
        super.onStart()
        presenter.subscribe()
    }

    override fun onStop() {
        super.onStop()
        presenter.unSubscribe()
    }
}