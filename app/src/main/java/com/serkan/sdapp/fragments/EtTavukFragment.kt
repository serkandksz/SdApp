package com.serkan.sdapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
import com.serkan.sdapp.R
import com.serkan.sdapp.adapters.ProductCategoryAdapter
import com.serkan.sdapp.adapters.SubCategoryNameAdapter

import com.serkan.sdapp.getDataEtTavuk
import com.serkan.sdapp.getSubCategoryEt
import kotlinx.android.synthetic.main.fragment_et_tavuk.*
import kotlinx.android.synthetic.main.fragment_et_tavuk.view.*
import kotlinx.android.synthetic.main.item_sub_categories.*


class EtTavukFragment : Fragment() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_et_tavuk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sub_category.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        sub_category.adapter = SubCategoryNameAdapter(getSubCategoryEt())

        val productCategoryAdapter = ProductCategoryAdapter()
        productCategoryAdapter.submitList(getDataEtTavuk())
        outerRecyclerView.adapter = productCategoryAdapter



        }

    }




