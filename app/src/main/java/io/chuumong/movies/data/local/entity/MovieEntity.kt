package io.chuumong.movies.data.local.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import javax.annotation.PropertyKey

/**
 * Created by JongHunLee on 2017-07-17.
 */

@Entity(tableName = "movies")
class MovieEntity {

    @PrimaryKey
    var id: Int? = null

    var posterPath: String? = null

    var adult: Boolean? = null

    var overView: String? = null

    var originalTitle: String? = null

    var title: String? = null

    var voteCount: Int? = null

    var voteAverage: Double? = null

    var backDropPath: String? = null

    var originalLangeuage: String? = null
}