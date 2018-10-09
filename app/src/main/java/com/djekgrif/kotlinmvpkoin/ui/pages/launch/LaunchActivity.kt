package com.djekgrif.kotlinmvpkoin.ui.pages.launch

import com.djekgrif.kotlinmvpkoin.ActivityMediator
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenterActivity

import layout.LaunchContract
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

/**
 * LaunchActivity doesn't have UI elements so we can use Activity like View (MVP) without Fragment.
 * Navigation logic is in presenter
 */

class LaunchActivity : BasePresenterActivity<LaunchContract.Presenter>(), LaunchContract.View {

    override val presenter: LaunchContract.Presenter by inject { parametersOf(this) }

    override fun startHome() {
        ActivityMediator.startHomeActivity(this)
    }

    override fun startSignUp() {
        ActivityMediator.startSignUpActivity(this)
    }

    override fun closePage() {
        finish()
    }
}
