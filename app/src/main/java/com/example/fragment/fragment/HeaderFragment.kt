package com.example.fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragment.R
import com.example.fragment.adapter.HeaderAdapter
import com.example.fragment.model.Header
import kotlinx.android.synthetic.main.fragment_header.*


class HeaderFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_header, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var headerList = ArrayList<Header>()
        headerList.add(Header("apple"))
        headerList.add(Header("apple"))
        headerList.add(Header("apple"))
        headerList.add(Header("apple"))
        headerList.add(Header("apple"))


        headerRecycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = HeaderAdapter(headerList)
        }


    }
}
