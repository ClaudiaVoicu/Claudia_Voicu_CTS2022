package memento.main;

import memento.clase.Autobaza;
import memento.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Gigel",6, 2008,"Otokar");
        Autobaza autobaza = new Autobaza();
        autobuz.createMementoAutobuz();
        autobaza.adaugaMemntoAutobuz(autobuz.createMementoAutobuz());


        autobuz.setNumeSofer("Doru");
        autobaza.adaugaMemntoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setConsumMediu(10);
        autobaza.adaugaMemntoAutobuz(autobuz.createMementoAutobuz());

        System.out.println(autobuz);

        autobuz.setMementoAutobuz(autobaza.getMementoAutobuz(0));

        System.out.println(autobuz);
    }
}
