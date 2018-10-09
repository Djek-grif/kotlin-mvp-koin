package com.djekgrif.kotlinmvpkoin.ui.pages.signup

import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenter
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BaseView

interface SignUpContract {

    interface View : BaseView {
        fun getUserName(): String
        fun showUserNameValidation()
        fun startHome()
    }

    interface Presenter : BasePresenter<View> {
        fun onClickGoBtn()
    }
}