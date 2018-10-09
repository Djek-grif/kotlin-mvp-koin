package com.djekgrif.kotlinmvpkoin.ui.pages.home

import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenter
import org.koin.standalone.KoinComponent

class HomePresenter(override val view: HomeContract.View) : BasePresenter<HomeContract.View>, HomeContract.Presenter, KoinComponent {
}