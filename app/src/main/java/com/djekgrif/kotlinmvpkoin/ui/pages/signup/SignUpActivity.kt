package com.djekgrif.kotlinmvpkoin.ui.pages.signup

import android.support.v4.app.Fragment
import com.djekgrif.kotlinmvpkoin.ui.pages.base.SingleFragmentActivity

class SignUpActivity: SingleFragmentActivity() {

    override fun onCreateFragment(): Fragment = SignUpFragment.newInstance()
}