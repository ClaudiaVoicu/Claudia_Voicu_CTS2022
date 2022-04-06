package main;

import clase.*;

public class Main {
    public static void afisareMijlocTransport(Factory factory, String nrInmatriculare){
        MijlocTransport mijlocTransport = factory.getMijlocTransport(nrInmatriculare);
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args) {
        afisareMijlocTransport(new AutobuzFactory(), "B 12 AAA");
        MijlocTransport troleibuz = new TroleibuzFactory().getMijlocTransport("B 123456");
        troleibuz.afiseazaDescriere();
        new TramvaiFactory().getMijlocTransport("B 123123").afiseazaDescriere();
    }
}
