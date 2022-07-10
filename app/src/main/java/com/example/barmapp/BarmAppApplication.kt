package com.example.barmapp

import android.app.Application
import com.example.barmapp.domain.di.koinModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class BarmAppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@BarmAppApplication)
            modules(koinModule)
        }
    }

}