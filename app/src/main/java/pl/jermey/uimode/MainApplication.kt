package pl.jermey.uimode

import android.app.Application
import android.content.ComponentCallbacks
import android.content.res.Configuration
import android.util.Log

class MainApplication : Application() {

    companion object {
        const val TAG = "MainApplication"
    }

    override fun onCreate() {
        super.onCreate()
        registerComponentCallbacks(object : ComponentCallbacks {
            override fun onConfigurationChanged(newConfig: Configuration) {
                Log.d(TAG, "onConfigurationChanged")
            }

            override fun onLowMemory() {
                Log.d(TAG, "onLowMemory")
            }
        })
    }
}