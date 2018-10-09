package com.djekgrif.kotlinmvpkoin.ui.pages.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.djekgrif.kotlinmvpkoin.R
import com.djekgrif.kotlinmvpkoin.ui.pages.base.BasePresenterFragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class HomeFragment : BasePresenterFragment<HomeContract.Presenter>(), HomeContract.View {

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }

    override val presenter: HomeContract.Presenter by inject { parametersOf(this) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, null)
    }
}