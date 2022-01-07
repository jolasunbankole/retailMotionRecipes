package com.example.retailmotionrecipes.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.retailmotionrecipes.R
import com.example.retailmotionrecipes.data.Chicken
import com.example.retailmotionrecipes.data.MeatBall
import com.example.retailmotionrecipes.data.MeatLoaf
import com.example.retailmotionrecipes.databinding.FragmentDinnerBinding


class DinnerFragment : Fragment() {

    private lateinit var binding: FragmentDinnerBinding

    lateinit var ingrB : ArrayList<String>
    lateinit var ingrL : ArrayList<String>
    lateinit var ingrC : ArrayList<String>


    lateinit var mtBall: MeatBall
    lateinit var mtLoaf: MeatLoaf
    lateinit var chiTm: Chicken

    private var meatIndex = 0
    private var loafIndex = 0
    private var tikkaIndex = 0

     private var meatBall = arrayListOf(
        MeatBall(
            "MeatBall",
            arrayListOf("Meat, Parmesan, Onions")
        ),
     )

    private var meatLoaf = arrayListOf(
        MeatLoaf(
            "MeatLoaf",
            arrayListOf("Meat, Eggs, Onions")
        ),
    )

    private var chickenTm = arrayListOf(
        Chicken(
            "Chicken Tikka",
            arrayListOf("Chicken, Butter, Onions")
        ),
    )



    private fun setRecipes() {
        mtBall = meatBall[meatIndex]
        mtLoaf = meatLoaf[loafIndex]
        chiTm = chickenTm[tikkaIndex]
        ingrB = ArrayList(mtBall.ingredientsB)
        ingrL = ArrayList(mtLoaf.ingredientsL)
        ingrC = ArrayList(chiTm.ingredientsC)

    }

    private fun clickedRP(click:String){
        when (click) {
            mtBall.ingredientsB[0] -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_dinnerFragment_to_meatBFragment)
            }
            mtLoaf.ingredientsL[0] -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_dinnerFragment_to_meatLFragment)
            }
            chiTm.ingredientsC[0] -> {
                Navigation.findNavController(requireView()).navigate(R.id.action_dinnerFragment_to_chickenTFragment)
            }
        }
    }






     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("DinnerUi", "onCreate Called")
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dinner, container, false)
        binding.titlelunch.text
        binding.instructions.text
        setRecipes()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.meatBallBtn.setOnClickListener {
            clickedRP(ingrB[0])
        }

        binding.meatLoafBtn.setOnClickListener {
            clickedRP(ingrL[0])
        }

        binding.chickenTMBtn.setOnClickListener {
            clickedRP(ingrC[0])

        }
    }




    override fun onDestroyView() {
        super.onDestroyView()
        binding

    }




}