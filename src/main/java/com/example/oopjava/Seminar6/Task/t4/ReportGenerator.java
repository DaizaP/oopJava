package com.example.oopjava.Seminar6.Task.t4;

public class ReportGenerator {
    private Connection connection;

    public ReportGenerator(Connection connection) {
        this.connection = connection;
    }

    public void generateReport() {
        //Логика генерации отчета используя connection
    }
}

interface Connection {
    void connect();

    void disconnect();
}

class DatabaseConnection implements Connection {

    @Override
    public void connect() {

    }

    @Override
    public void disconnect() {

    }
}
