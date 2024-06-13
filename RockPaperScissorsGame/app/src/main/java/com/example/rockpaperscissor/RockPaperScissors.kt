package com.example.rockpaperscissor

fun main(){
    var computerchoice = "";
    var playerchoice = "";
    println("Rock Paper Scissors Enter your choice");
    playerchoice = readln();
    var randomnumber = (1..3).random();
    if(randomnumber == 1){
        computerchoice = "Rock";
    }
    else if(randomnumber == 2){
        computerchoice = "Paper";
    }else {
        computerchoice = "Scissors ";
    }
//    this is when template for easy int prossesion
//    when(randomnumber){
//        1 -> {
//            computerchoice = "Rock";
//        }
//        2 -> {
//            computerchoice = "Paper";
//        }
//        3 -> {
//            computerchoice = "Scissors ";
//        }
//    }

    val winner = when {
        playerchoice == computerchoice -> "Draw";
        playerchoice == "Rock" && computerchoice == "Scissors" -> "Player";
        playerchoice == "Paper" && computerchoice == "Rock" -> "Player";
        playerchoice == "Scissors" && computerchoice == "Paper" -> "Player";
        else -> "Computer";
    }
    println(winner);



}