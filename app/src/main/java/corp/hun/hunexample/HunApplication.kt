package corp.hun.hunexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HunApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: HunApplication
    }

}