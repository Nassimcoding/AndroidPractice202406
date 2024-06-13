package com.example.daytwo


//val can't change value if it define once
val name: String = "nassim";
//var can change value any time
var nickname: String = "nassim nickname";

fun main(){
    var mainname: String = "imprivate value" + name;
    println("hello $name");
    println("hello " + name);
    println("hello " + nickname);
    println("hello " + mainname);
    mainname = "imprivate value" + nickname;
    println("hello " + mainname);
    booltest();
    stringtest();
    iftest();
}

//boolean test
fun booltest(){
    var mytrue: Boolean = true;
    var myfalse: Boolean = false;
    var mynot: Boolean = !(mytrue || myfalse);
    println(mytrue || myfalse);
    println(mynot);

}

//string test
fun stringtest(){
    val mychar: Char = 'a';
    // \U00ae = @
    val myunicode: Char = '\u00AE';
    var mystring: String = "hello";
    println(mychar);
    println(myunicode);
    println("$mystring $mychar");
    mystring = mystring + mychar;
    for (c in mystring){
        println(c.lowercase());
        println(c.uppercase());
    }
}

//if test
fun iftest(){
    var num = 15;
    num = readln().toInt();
    if(num > 10){
        println("num is greater than 10");
    }else{
        println("num is less than 10");
    }
}