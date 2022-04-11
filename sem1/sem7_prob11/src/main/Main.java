package main;

import clase.Calator;
import clase.ICalator;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport =  new MijlocTransport("168");
        ICalator c1 = new Calator("Vasile");
        ICalator c2 = new Calator("Mihai");
        ICalator c3 = new Calator("Gigel");
        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);

        mijlocTransport.trimiteMesajPlecareCapatLinie();
        System.out.println();

        mijlocTransport.stergeCalator(c2);
        mijlocTransport.adaugaCalator(c3);

        mijlocTransport.trimiteMesajPlecareCapatLinie();

    }
}
