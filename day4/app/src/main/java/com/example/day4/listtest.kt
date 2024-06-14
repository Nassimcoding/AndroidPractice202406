package com.example.day4


//list method
fun main(){

    //immutable list if it initialized with val
    val shoplist = listOf("milk","eggs","bread");
    println(shoplist);

    val cshoplist = mutableListOf("haha", "hehe");
    cshoplist.add("butter");
    println(cshoplist);

    cshoplist.remove("haha");
    cshoplist.removeAt(0);
    cshoplist.add(index = 1, element = "qq");
    cshoplist.add(index = 1, element = "pp");
    println(cshoplist);
    println(cshoplist[1]);
    println(cshoplist.size);

    // for loop test
    for(item in cshoplist){
        println(item);
    }

    // for loop test
    for(item in 0 until cshoplist.size){
        println(cshoplist[item]);
    }


}