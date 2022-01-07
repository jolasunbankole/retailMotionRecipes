package com.example.retailmotionrecipes.fragments

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
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
class UiFragmentTest {


    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Before
    fun setUp() {
    }




    @Test
    fun espressoTest() {
        Espresso.onView(withId(R.id.title))
        Espresso.onView(withId(R.id.question))
        Espresso.onView(withId(R.id.hungryBtn)).perform(click())


    }
}