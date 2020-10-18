package com.serkan.sdapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.serkan.sdapp.databinding.ItemSubCategoriesBinding
import com.serkan.sdapp.fragments.ProductCategory
import kotlinx.android.synthetic.main.item_sub_categories.view.*
import kotlinx.android.synthetic.main.item_sub_category_name.view.*

class ProductCategoryAdapter : ListAdapter<ProductCategory, CustomViewHolder>(Companion) {
    private val viewPool = RecyclerView.RecycledViewPool()

    companion object : DiffUtil.ItemCallback<ProductCategory>() {
        override fun areItemsTheSame(oldItem: ProductCategory, newItem: ProductCategory): Boolean {
            return  oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: ProductCategory, newItem: ProductCategory): Boolean {
            return  oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemSubCategoriesBinding.inflate(inflater, parent, false)

        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentProductCategory = getItem(position)
        val itemBinding = holder.binding as ItemSubCategoriesBinding

        itemBinding.productCategory= currentProductCategory
        itemBinding.nestedRecyclerView.setRecycledViewPool(viewPool)
        itemBinding.executePendingBindings()
        
    }
}