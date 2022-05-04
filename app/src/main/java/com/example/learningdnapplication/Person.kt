package com.example.learningdnapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Person(
    val age: Int,
    val name: String
) : Parcelable