package com.example.day3

class dog (val name: String,val number: Int){

    //init process settings
    init{
        bark(name);
    }

    fun bark(name:String){
        println("$name woof");
    }



}