package com.company;

import java.util.Scanner;

public class Car {
    String playerName;
    int position;


    public Car(String playerName, int position) {
        this.playerName = playerName;
        this.position = position;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }


    public void move(){

        System.out.println("\u001B[31m"+playerName +"\u001B[0m Presiona Enter para lanzar el dado!!");
        Scanner reader = new Scanner(System.in);
        reader.nextLine();
        int number = (int) Math.floor(Math.random()*6+1);
        position= position+ (number*100);
        System.out.println("\u001B[31m"+playerName +"\u001B[0m avanzaste \u001B[33m"+ (number*100)+ "\u001B[0m metros tu posicion actual es \u001B[34m"+ position+"\u001B[0m\n metros");
    }
}
