package com.djekgrif.kotlinmvpkoin.ui.pages.signup

import android.text.TextUtils
import com.djekgrif.kotlinmvpkoin.managers.SharedPrefManager
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenter
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class SignUpPresenter(override val view: SignUpContract.View) : BasePresenter<SignUpContract.View>, SignUpContract.Presenter, KoinComponent {

    private val preferences: SharedPrefManager by inject()

    override fun onClickGoBtn() {
        if(TextUtils.isEmpty(view.getUserName())){
            view.showUserNameValidation()
        } else {
            preferences.saveUserName(view.getUserName())
            view.startHome()
        }
        view.closePage()
    }
}