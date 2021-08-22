package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
/**
全局获得Context
 **/
class SunnyWeatherApplication :Application(){
    companion object{
        const val TOKEN="LINGPAI"
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }


}