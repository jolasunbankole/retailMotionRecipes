# RiMotion_recipes
Tech Task challenge by Retail inMotion. Junior Android Developer role
# Introduction
This app is a small cookbook with only 3 dishes provided to me by Retail InMotion. Demos some ingredients from a Json file I created from the JSON I was provided. This app demonstrated the use of the Android Jetpack component. The app also leverages Json to Kotlin, Data Binding, and Navigation with the SafeArgs plugin for parameter passing between fragments.
# Fragments
I’m using fragments(static) for each page the user will navigate through, it is really more of preference, as this is how I create all my apps that have navigation components within it, it is something I'm very comfortable working with, and If I want to go back and make changes and have the fragments implement more content I can without having to start from scratch.
# DataBinding
Data Binding my code instead of using View binding again is something I use all the time for my own projects, I used it here as I wanted to allow my backend code in (Dinner fragment) to look a lot less messy and easy to read for myself or whoever else that may be interested knowing how it's used. I can locate all the views I’ve implemented and display them on the UI. 
# Data Provided
My data folder holds the data that communicates with my (Dinner Fragment) which holds the backend for my app and displays it for the user after the interaction. Although my first approach to use binding failed, instead I used it to know which button is being clicked and then where to go after the button(Ingredients) has been chosen.
