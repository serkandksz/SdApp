package com.serkan.sdapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serkan.sdapp.R
import kotlinx.android.synthetic.main.item_sub_category_name.view.*

class SubCategoryNameAdapter(val subCategoryList: ArrayList<String>): RecyclerView.Adapter<SubCategoryNameAdapter.SubCategoryViewHolder>() {
    class SubCategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubCategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_sub_category_name, parent, false)
        return SubCategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return subCategoryList.size
    }

    override fun onBindViewHolder(holder: SubCategoryViewHolder, position: Int) {
        holder.itemView.subCategory_names.text = subCategoryList[position]

    }
}