package com.djekgrif.kotlinmvpkoin.ui.pages

import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.widget.Toast
import com.djekgrif.kotlinmvpkoin.App

fun Fragment.showToast(@StringRes textResources: Int){
    Toast.makeText(App.get(), App.get().getString(textResources), Toast.LENGTH_LONG).show()
}

fun Fragment.showToast(text: String) {
    Toast.makeText(App.get(), text, Toast.LENGTH_LONG).show()
}