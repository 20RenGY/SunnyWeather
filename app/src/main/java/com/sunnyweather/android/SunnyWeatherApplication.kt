package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
/**
全局获得Context
 **/
class SunnyWeatherApplication :Application(){
    companion object{
        const val TOKEN="DF91LghxhfX5XbuC"
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }


}