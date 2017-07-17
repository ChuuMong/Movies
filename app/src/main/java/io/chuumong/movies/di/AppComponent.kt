package io.chuumong.movies.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import io.chuumong.movies.App
import io.chuumong.movies.di.activity.AndroidBuilderModule
import javax.inject.Singleton

/**
 * Created by JongHunLee on 2017-07-17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, AndroidInjectionModule::class, AndroidBuilderModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}