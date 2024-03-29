package com.example.MobileOrdering.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.MobileOrdering.R

class OrderFragment : Fragment() {

    private lateinit var orderViewModel: OrderViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        orderViewModel =
            ViewModelProviders.of(this).get(OrderViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_order, container, false)
        return root
    }
}