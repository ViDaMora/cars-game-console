package com.company;
import java.util.Scanner;

public class Game {

    Car players[];
    Rail boardInfo;
    Podio winners;

    public Game(Car players[], Rail boardInfo) {
        this.players = players;
        this.boardInfo = boardInfo;
    }

    public Game() {
    }

    public void setWinners(Podio winners) {
        this.winners = winners;
    }

    public Car[] getPlayers() {
        return players;
    }

    public void setPlayers(Car[] players) {
        this.players = players;
    }

    public Rail getBoardInfo() {
        return boardInfo;
    }

    public void setBoardInfo(Rail boardInfo) {
        this.boardInfo = boardInfo;
    }

    public void gameConfig(){
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Cuantos kilometros tiene la pista?");
        int kilometers = reader.nextInt();
        System.out.println("¿Cuantos jugadores van a copetir? ");
        int players = reader.nextInt();
        boardInfo = new Rail((kilometers*1000),players);
        this.players = createPlayers(players);
    }
    public static Car[] createPlayers(int numberOfPlayers){
        Scanner reader = new Scanner(System.in);
        Car players[]= new Car[numberOfPlayers];
        for (int i=0; i<numberOfPlayers; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i+1));
            String name = reader.nextLine();
            players[i] = new Car(name, 0);
        }
        return players;
    }
    public void startGame(){
        this.winners = new Podio();
        int limit;
        if (this.players.length<3){
            limit=this.players.length;
        }else{
            limit=3;
        }
        int count =0;
        while(count < limit) {
                for (int i =0; i <this.players.length;i++ ){
                    if (this.players[i].position<this.boardInfo.kilometers){
                    this.players[i].move();
                    if (this.players[i].position>= this.boardInfo.kilometers){
                            winners.assign(this.players[i].playerName);
                             count++;
                    }
                }}
        }

    }
    public void endGame(){
        System.out.println("Los ganadores son: ");
        System.out.println("El primer lugar es para: "+ this.winners.getFirst());
        System.out.println("El segundo lugar es para: "+this.winners.getSecond());
        System.out.println("El tercer lugar es para: "+this.winners.getThird());
    }

}
