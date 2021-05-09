package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println("Bienvenido al challenge de \u001B[33m Softka \u001B[0m - Juego de carros por consola");
        Game board = new Game();
        board.gameConfig();
        board.startGame();
        board.endGame();
        board.winners.savePodio();
    }
}
