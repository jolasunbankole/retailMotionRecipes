package com.example.retailmotionrecipes.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.retailmotionrecipes.R
import com.example.retailmotionrecipes.databinding.FragmentMeatBBinding


class MeatBFragment : Fragment(){

private lateinit var binding: FragmentMeatBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_meat_b, container, false)
        binding.mbImg.drawable
        binding.mbHeading.text
        return binding.root

    }


}