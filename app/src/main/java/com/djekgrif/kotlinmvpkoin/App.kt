package com.djekgrif.kotlinmvpkoin

import android.app.Application
import com.djekgrif.kotlinmvpkoin.di.appModules
import org.koin.android.ext.android.startKoin

class App : Application() {


    companion object {
        private lateinit var instance: App
        fun get(): App = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        // Start Koin
        startKoin(this, appModules)
    }
}