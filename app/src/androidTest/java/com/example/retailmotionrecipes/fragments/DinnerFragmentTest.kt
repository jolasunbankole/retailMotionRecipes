package com.example.retailmotionrecipes.fragments

import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.retailmotionrecipes.MainActivity
import com.example.retailmotionrecipes.R
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class DinnerFragmentTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @Test
    fun espressoTestTw() {
        Espresso.onView(withId(R.id.titlelunch))
        Espresso.onView(withId(R.id.instructions))
        Espresso.onView(withId(R.id.meatLoafBtn)).perform()
        Espresso.onView(withId(R.id.chickenTMBtn)).perform()
        Espresso.onView(withId(R.id.meatBallBtn)).perform()


    }

}