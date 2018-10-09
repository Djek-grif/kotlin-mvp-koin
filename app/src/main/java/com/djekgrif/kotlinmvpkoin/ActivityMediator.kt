package com.djekgrif.kotlinmvpkoin

import android.content.Context
import android.content.Intent
import com.djekgrif.kotlinmvpkoin.ui.pages.signup.SignUpActivity

object ActivityMediator {

    fun startHomeActivity(context: Context){
        context.startActivity(Intent(context, HomeActivity::class.java))
    }

    fun startSignUpActivity(context: Context){
        context.startActivity(Intent(context, SignUpActivity::class.java))
    }
}