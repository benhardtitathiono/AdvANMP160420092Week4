package com.ubaya160420092.adv160420092week4.model

import com.google.gson.annotations.SerializedName

data class Student(
    val id:String?,

    @SerializedName("student_name")
    var name:String?,

    @SerializedName("birth_of_date")
    var bod:String?,

    var phone:String?,

    @SerializedName("photo_url")
    val photoUrl:String?,
)