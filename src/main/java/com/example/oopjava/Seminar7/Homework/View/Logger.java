package com.example.oopjava.Seminar7.Homework.View;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    Notification1 notification1 = new Notification1();
    FileWriter writer;
    public Logger(){

    }
    public void printLog(String text){
        try {
            writer = new FileWriter("log.txt", false);
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            notification1.exception(e);;
        }
    }
}

