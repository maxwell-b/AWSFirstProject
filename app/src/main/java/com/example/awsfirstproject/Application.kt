package com.example.awsfirstproject

import android.app.Application

class AWSFirstProjectApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // initialize Amplify when application is starting
        Backend.initialize(applicationContext)
    }
}