package com.djekgrif.kotlinmvpkoin.ui.pages

import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.view.View

fun View.showSnackeBar(@StringRes messageRes: Int){
    Snackbar.make(this, messageRes, Snackbar.LENGTH_LONG).show()
}