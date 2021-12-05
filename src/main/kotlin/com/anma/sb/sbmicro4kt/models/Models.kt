package com.anma.sb.sbmicro4kt.models

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "cats")
data class Cat(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "cat_id") val catId: Long,
    val id: String,
    val name: String,
    val color: String,
    val breed: String,
    val registry: String,
    val origin: String,
    @Column(name = "country_codes") val countryCodes: String,
    @Column(name = "wikipedia_url") val wikipediaUrl: String,
    val age: Int,
    val indoor: Int,
    val intelligence: Int,
    val hairless: Int,
    val adaptability: Int,
    @Column(name = "dog_friendly") val dogFriendly: Int,
    @Column(name = "person_id") val personId: Long
)

@Entity
@Table(name = "comments")
data class Comment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") val id: Long,
    val body: String,
    val category: String,
    @Column(name = "created_at") val createdAt: LocalDateTime,
    @Column(name = "author_id") val authorId: Long
)

@Entity
@Table(name = "persons")
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    val id: Long = 0,
    val name: String? = null,
    @Column(name = "full_name") val fullName: String? = null,
    val email: String? = null,
    val gender: String? = null,
    val status: String? = null,
    val age: Int,
    val cars: Int,
    @Column(name = "country_code")
    val countryCode: String? = null,

    @Column(name = "has_children") val hasChildren: Boolean,
    val engaged: Boolean,
    val createdAt: LocalDateTime,

    @Column(name = "country_id")
    val countryId: Long = 0
)