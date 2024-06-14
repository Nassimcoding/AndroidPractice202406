package com.example.day3

fun main(){
    println(funtest(7,5));
    var emily = dog(name = "emily", number = 5);
    println(emily.name + " " + emily.number);
}


//if you need to return a value you must define the return type like c#
fun funtest(num1: Int, num2: Int): Int{
    var result = num1 + num2;
    return result;
}