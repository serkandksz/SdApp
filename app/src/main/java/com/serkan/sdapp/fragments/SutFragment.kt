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
import kotlinx.android.synthetic.main.fragment_sebze_meyve.*
import kotlinx.android.synthetic.main.fragment_sut.*


class SutFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sut, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sub_category4.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)
        sub_category4.adapter = SubCategoryNameAdapter(getSubCategorySutVeSutU())

        val productCategoryAdapter = ProductCategoryAdapter()
        productCategoryAdapter.submitList(getDataSutVeSutUrun())
        outerRecyclerView4.adapter = productCategoryAdapter
    }
}