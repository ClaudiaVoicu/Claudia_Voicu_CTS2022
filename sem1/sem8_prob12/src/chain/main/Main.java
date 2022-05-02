package chain.main;

import chain.clase.AutobuzHandler;
import chain.clase.MetrouHandler;
import chain.clase.TramvaiHandler;
import chain.clase.TroleibuzHandler;

public class Main {
    public static void main(String[] args) {
        AutobuzHandler autobuz = new AutobuzHandler(5);
        TroleibuzHandler troleibuz = new TroleibuzHandler(3);
        TramvaiHandler tramvai = new TramvaiHandler(10);
        MetrouHandler metrou = new MetrouHandler(1000);

        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        troleibuz.afisareMijlocTransport(7);
        troleibuz.afisareMijlocTransport(20);
        troleibuz.afisareMijlocTransport(2);
        troleibuz.afisareMijlocTransport(4);
        System.out.println("De aici Cluj!");

        AutobuzHandler autobuzCluj = new AutobuzHandler(1000);
        TroleibuzHandler troleibuzCluj = new TroleibuzHandler(5);
        TramvaiHandler tramvaiCluj = new TramvaiHandler(2);


        tramvaiCluj.setHandler(troleibuzCluj);
        troleibuzCluj.setHandler(autobuzCluj);

        tramvaiCluj.afisareMijlocTransport(1);
        tramvaiCluj.afisareMijlocTransport(3);
        tramvaiCluj.afisareMijlocTransport(10);

    }
}
