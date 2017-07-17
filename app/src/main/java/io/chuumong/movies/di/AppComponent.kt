package io.chuumong.movies.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import io.chuumong.movies.App
import io.chuumong.movies.di.activity.ActivityBuilderModule
import javax.inject.Singleton

/**
 * Created by JongHunLee on 2017-07-17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, AndroidSupportInjectionModule::class, ActivityBuilderModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}