package main;


import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setDeschideUsi(Boolean.TRUE).setModel("Nou");
        Autobuz autobuz = autobuzBuilder.build();
        System.out.println(autobuz);


    }
}
