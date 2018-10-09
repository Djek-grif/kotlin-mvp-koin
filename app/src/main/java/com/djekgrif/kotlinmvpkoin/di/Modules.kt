package com.djekgrif.kotlinmvpkoin.di

import com.djekgrif.kotlinmvpkoin.App
import com.djekgrif.kotlinmvpkoin.managers.SharedPrefManager
import com.djekgrif.kotlinmvpkoin.ui.pages.home.HomeContract
import com.djekgrif.kotlinmvpkoin.ui.pages.home.HomePresenter
import com.djekgrif.kotlinmvpkoin.ui.pages.launch.LaunchPresenter
import com.djekgrif.kotlinmvpkoin.ui.pages.signup.SignUpContract
import com.djekgrif.kotlinmvpkoin.ui.pages.signup.SignUpPresenter
import layout.LaunchContract
import org.koin.dsl.module.module

val DataModule = module {
    single { SharedPrefManager(App.get()) }

}

val PagesModule = module {
    factory { (view: LaunchContract.View) -> LaunchPresenter(view) as LaunchContract.Presenter }
    factory { (view: SignUpContract.View) -> SignUpPresenter(view) as SignUpContract.Presenter }
    factory { (view: HomeContract.View) -> HomePresenter(view) as HomeContract.Presenter }
}


val appModules = listOf(DataModule, PagesModule)