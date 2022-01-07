package com.example.retailmotionrecipes.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.retailmotionrecipes.R
import com.example.retailmotionrecipes.databinding.FragmentUiBinding


class UiFragment : Fragment() {

    private lateinit var binding: FragmentUiBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ui, container, false)
        binding.title.text
        binding.question.text
        binding.hungryBtn.setOnClickListener{
            findNavController().navigate(R.id.action_uiFragment_to_dinnerFragment)
        }




        return binding.root
    }


}