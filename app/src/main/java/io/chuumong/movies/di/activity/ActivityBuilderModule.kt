package io.chuumong.movies.di.activity

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.chuumong.movies.di.fragment.FragmentBuilderModule
import io.chuumong.movies.ui.activity.MainActivity

/**
 * Created by JongHunLee on 2017-07-17.
 */

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = arrayOf(FragmentBuilderModule::class))
    abstract fun mainActivity(): MainActivity
}

