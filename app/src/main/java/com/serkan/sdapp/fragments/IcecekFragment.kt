package com.serkan.sdapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.serkan.sdapp.*
import com.serkan.sdapp.adapters.ProductCategoryAdapter
import com.serkan.sdapp.adapters.SubCategoryNameAdapter
import kotlinx.android.synthetic.main.fragment_et_tavuk.*
import kotlinx.android.synthetic.main.fragment_icecek.*


class IcecekFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_icecek, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sub_category2.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)
        sub_category2.adapter = SubCategoryNameAdapter(getSubCategoryIcecek())

        val productCategoryAdapter = ProductCategoryAdapter()
        productCategoryAdapter.submitList(getDataIcecek())
        outerRecyclerView2.adapter = productCategoryAdapter
    }
}