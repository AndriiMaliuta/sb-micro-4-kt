package com.anma.sb.sbmicro4kt.models.web

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class CatWeb(
    @JsonProperty(value = "cat_id") val catId: Long,
    val id: String,
    val name: String,
    val origin: String,
    val breed: String,
    val age: Int
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class CommentWeb(
    @JsonProperty(value = "comment_id") val commentId: Long,
    val body: String,
    val category: String,
    @JsonProperty(value = "author_id") val authorId: Long,
    @JsonProperty(value = "country_codes") val countryCodes: String,
    @JsonProperty(value = "wikipedia_url") val wikipediaUrl: String,
    @JsonProperty(value = "created_at") val createdAt: LocalDateTime,
    val hairless: Int
    )