package com.example.retailmotionrecipes.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.retailmotionrecipes.R
import com.example.retailmotionrecipes.databinding.FragmentMeatLBinding


class MeatLFragment : Fragment() {

    private lateinit var binding: FragmentMeatLBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_meat_l, container, false)
        binding.mlImg.drawable
        binding.mlHeading.text
        return binding.root

    }


}