package com.djekgrif.kotlinmvpkoin.ui.pages.home

import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenter
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BaseView

interface HomeContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

    }
}