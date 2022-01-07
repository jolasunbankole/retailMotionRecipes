package com.example.retailmotionrecipes.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.retailmotionrecipes.R
import com.example.retailmotionrecipes.databinding.FragmentChickenTBinding


class ChickenTFragment : Fragment() {

    private lateinit var binding: FragmentChickenTBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_chicken_t, container, false)
        binding.ctmHeading.text
        binding.chiImg.drawable
        return binding.root
    }


}