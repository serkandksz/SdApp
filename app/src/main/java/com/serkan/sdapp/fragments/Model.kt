package com.serkan.sdapp.fragments

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val category: String,
    val id: String,
    val title: String,
    val imageRes: Int,
    val productUnit: String,
    val productFirstCost: String,
    val productSecondCost: String
) : Parcelable

@Parcelize
data class ProductCategory(
    val id: String,
    val title: String,
    val products: List<Product>
) : Parcelable