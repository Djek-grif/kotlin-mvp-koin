package com.djekgrif.kotlinmvpkoin.ui.pages.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.djekgrif.kotlinmvpkoin.R

abstract class SingleFragmentActivity: BaseActivity() {

    companion object {
        const val FRAGMENT_TAG = "_single_fragment_tag"
    }

    protected lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResource())
        fragmentManager = supportFragmentManager
        initFragment()
    }

    private fun initFragment() {
        var fragment = fragmentManager.findFragmentById(R.id.fragment_container)
        if (fragment == null) {
            fragment = onCreateFragment()
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment, fragment.javaClass.simpleName + FRAGMENT_TAG)
                    .commit()
        }
    }

    protected fun getLayoutResource(): Int {
        return R.layout.activity_single_fragment
    }

    protected abstract fun onCreateFragment(): Fragment
}