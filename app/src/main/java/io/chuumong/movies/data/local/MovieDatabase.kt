package io.chuumong.movies.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import io.chuumong.movies.data.local.dao.MovieDao
import io.chuumong.movies.data.local.entity.MovieEntity

/**
 * Created by JongHunLee on 2017-07-17.
 */

@Database(entities = arrayOf(MovieEntity::class), version = 1)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}