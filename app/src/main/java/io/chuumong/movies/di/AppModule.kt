package io.chuumong.movies.di

import android.app.Application
import android.arch.persistence.room.Room
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import io.chuumong.movies.common.Const
import io.chuumong.movies.data.local.MovieDatabase
import io.chuumong.movies.data.local.dao.MovieDao
import io.chuumong.movies.data.remote.api.MovieService
import io.chuumong.movies.data.remote.util.RequestInterceptor
import io.chuumong.movies.di.viewmodel.ViewModelModule
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by JongHunLee on 2017-07-17.
 */

@Module(includes = arrayOf(ViewModelModule::class))
class AppModule {

    @Provides
    @Singleton
    fun provideOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder().connectTimeout(Const.TIME_OUT_SEC, TimeUnit.SECONDS)
                .readTimeout(Const.TIME_OUT_SEC, TimeUnit.SECONDS)
                .addInterceptor(RequestInterceptor()).build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .baseUrl(Const.END_POINT)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
    }

    @Provides
    @Singleton
    fun provideMoviesService(retrofit: Retrofit): MovieService {
        return retrofit.create(MovieService::class.java)
    }

    @Provides
    @Singleton
    fun provideMovieDatabase(application: Application): MovieDatabase {
        return Room.databaseBuilder(application, MovieDatabase::class.java, "movie.db").build()
    }


    @Provides
    @Singleton
    fun provideMovieDao(movieDatabase: MovieDatabase): MovieDao {
        return movieDatabase.movieDao()
    }

}