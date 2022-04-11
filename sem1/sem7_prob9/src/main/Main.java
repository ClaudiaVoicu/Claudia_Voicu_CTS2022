package main;

import clase.Autobuz;
import clase.AutobuzLinie;
import clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new Autobuz("Audi", "2010", 30);
        AutobuzLinie a2 = new Autobuz("Mercedez", "2015", 20);
        AutobuzLinie a3 = new Autobuz("Dacia", "2009", 40);
        AutobuzLinie a4 = new Autobuz("Renault", "2016", 20);

        FlyweightFactory factory = new FlyweightFactory();

        a1.descrie(factory.getLinie(168));
        a2.descrie(factory.getLinie(105));
        a3.descrie(factory.getLinie(168));
        a4.descrie(factory.getLinie(137));

    }
}
