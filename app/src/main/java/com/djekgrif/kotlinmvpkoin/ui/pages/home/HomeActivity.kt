package com.djekgrif.kotlinmvpkoin

import android.support.v4.app.Fragment
import com.djekgrif.kotlinmvpkoin.ui.pages.base.SingleFragmentActivity
import com.djekgrif.kotlinmvpkoin.ui.pages.home.HomeContract
import com.djekgrif.kotlinmvpkoin.ui.pages.home.HomeFragment

class HomeActivity : SingleFragmentActivity() {

    override fun onCreateFragment(): Fragment = HomeFragment.newInstance()
}
