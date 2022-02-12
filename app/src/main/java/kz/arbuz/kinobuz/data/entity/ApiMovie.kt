package kz.arbuz.kinobuz.data.entity

import com.google.gson.annotations.SerializedName

data class ApiMovie(
    val id: String?,
    val title: String?,
    val image: String?,
    val year: String?,
    @SerializedName("imDbRating")
    val rating: String?
)