package com.serkan.sdapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.serkan.sdapp.databinding.ItemProductBinding
import com.serkan.sdapp.fragments.Product

class CustomViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)


class ProductsAdapter : ListAdapter<Product, CustomViewHolder>(Companion) {
    companion object : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return  oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return  oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemProductBinding.inflate(inflater, parent, false)

        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentProduct = getItem(position)
        val itemBinding = holder.binding as ItemProductBinding
        itemBinding.product = currentProduct
        itemBinding.executePendingBindings()


    }
}