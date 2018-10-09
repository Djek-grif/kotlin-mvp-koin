package com.djekgrif.kotlinmvpkoin.ui.pages.launch

import com.djekgrif.kotlinmvpkoin.managers.SharedPrefManager
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenter
import layout.LaunchContract
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class LaunchPresenter(override val view: LaunchContract.View) : BasePresenter<LaunchContract.View>, LaunchContract.Presenter, KoinComponent {

    val prefManager: SharedPrefManager by inject()

    override fun subscribe() {
        if(prefManager.getUserName().isEmpty()) {
            view.startSignUp()
        } else {
            view.startHome()
        }
        view.closePage()
    }
}