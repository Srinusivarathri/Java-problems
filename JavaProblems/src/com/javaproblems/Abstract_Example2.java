package com.javaproblems;
/*
Abstract Classes


A board game company creates new board games every year. While all the games have different rules, they also are all similar in that they each have a name and a play() method.
We need to create 3 different games - Monopoly, Chess and Battleships. In the play() method Monopoly should print “Buy all property.”, Battleships - “Sink all ships.”, and Chess - “Kill the enemy king.”
Complete the code by implementing the getName() and play() methods inherited from abstract Game class.
To give a name to games just return the name string inside the getName() function.
*/
public class Abstract_Example2 {
    public static void main(String[] args) {
        //do not touch this code
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();
        
        monopoly.play();
        chess.play();
        battleships.play();
    }
 }
 
 abstract class Game {
    abstract String getName();
    abstract void play();
 }
 
 class Monopoly extends Game {
 
    //give "Monopoly" name to game
    String getName() {
        return "Monopoly";
    }
 
    // play method should print "Buy all property."
    void play() {
        System.out.println("Buy all property.");
    }
 }
 
 class Chess extends Game {
 
    //give "Chess" name to game
    String getName() {
        return "Chess" ;
    }
 
    // play method should print "Kill the enemy king."
    void play() {
        System.out.println("Kill the enemy king.");
    }
 }
 
 class Battleships extends Game {
 
    //give "Battleships" name to game
    String getName() {
        return "Battleships";
    }
 
    // play method should print "Sink all ships."
    void play() {
        System.out.println("Sink all ships.");
    }
 }