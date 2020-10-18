package com.serkan.sdapp

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.serkan.sdapp.adapters.ProductsAdapter
import com.serkan.sdapp.fragments.Product

@BindingAdapter(value = ["setProducts"])
fun RecyclerView.setProducts(products: List<Product>?) {
    if (products != null) {
        val productAdapter = ProductsAdapter()
        productAdapter.submitList(products)

        adapter = productAdapter
    }
}