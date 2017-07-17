package io.chuumong.movies.data.remote.model

import com.google.gson.annotations.SerializedName

/**
 * Created by JongHunLee on 2017-07-17.
 */
data class Movie(
        @SerializedName("id")
        private var id: Int = 0,

        @SerializedName("poster_path")
        private var posterPath: String? = null,

        @SerializedName("adult")
        private var adult: Boolean = false,

        @SerializedName("overview")
        private var overview: String? = null,

        @SerializedName("original_title")
        private var originalTitle: String? = null,

        @SerializedName("title")
        private var title: String? = null,

        @SerializedName("vote_count")
        private var voteCount: Int = 0,

        @SerializedName("vote_average")
        private var voteAverage: Double = 0.toDouble(),

        @SerializedName("backdrop_path")
        private var backdropPath: String? = null,

        @SerializedName("original_language")
        private var originalLanguage: String? = null
)