package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;
import java.net.http.*;
import java.util.Scanner;


public class Podio {
    String first;
    String second;
    String third;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }
    public void assign(String name){
        if (first==null){
            setFirst(name);
        }else if (second==null){
            setSecond(name);
        }else if(third==null){
            setThird(name);
        }
    }

    public void savePodio(){
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            FileWriter file = new FileWriter("winner.txt",true);
            file.write("Fecha del torneo: "+ timestamp+"\n");
            file.write("Primer puesto "+ getFirst()+"\n");
            file.write("Segundo puesto "+getSecond()+"\n");
            file.write("Tercer puesto "+getThird()+"\n");
            file.close();
            System.out.println("Guardado exitoso en winner.txt");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }

    }

}
