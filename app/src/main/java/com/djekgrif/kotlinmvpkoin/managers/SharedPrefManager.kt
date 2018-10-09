package com.djekgrif.kotlinmvpkoin.managers

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.djekgrif.kotlinmvpkoin.App

class SharedPrefManager(app: App) {

    companion object {
        const val USER_NAME_KEY = "user_name_key"
    }

    private var sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)

    fun saveUserName(name: String) {
        sharedPreferences.edit().putString(USER_NAME_KEY, name).apply()
    }

    fun getUserName(): String  = sharedPreferences.getString(USER_NAME_KEY, "") ?: ""

}