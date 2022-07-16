package com.example.barmapp

import android.app.Application
import com.example.barmapp.data.di.dataModule
import com.example.barmapp.domain.di.domainModule
import com.example.barmapp.ui.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class BarmAppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@BarmAppApplication)
            modules(domainModule, uiModule, dataModule)
        }
    }

}