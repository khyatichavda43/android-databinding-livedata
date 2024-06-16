package com.example.databindingdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val mybookname=MutableLiveData<String>("The Magic of the lost temple")
    val myAuther=MutableLiveData<String>("Sudha Murty")
    val userval=MutableLiveData<String>("")

    fun updateLiveData(){
        mybookname.value="Pride and Prejudice"
        myAuther.value="Jane Austen"
    }

}