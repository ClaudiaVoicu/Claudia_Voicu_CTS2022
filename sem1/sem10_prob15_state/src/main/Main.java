package main;

import clase.Autobuz;
import clase.Stare;
import clase.StareLaCapatDeLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(305);

        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();
        //autobuz.setStare(new StareLaCapatDeLinie());
        autobuz.intraInService();
        autobuz.pleacaInCursa();


    }
}
