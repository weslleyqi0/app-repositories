package com.weslleyqi0.apprepositories

import android.app.Application
import com.weslleyqi0.apprepositories.data.di.DataModule
import com.weslleyqi0.apprepositories.domain.di.DomainModule
import com.weslleyqi0.apprepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}