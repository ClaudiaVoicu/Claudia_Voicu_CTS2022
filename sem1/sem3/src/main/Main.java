package main;

import simple_factory.Autobuz;
import simple_factory.FabricaMijlocTransport;
import simple_factory.MijlocTransport;
import simple_factory.TipMijlocTransport;
import singletone.Singletone;

public class Main {
    public static void main(String[]args){
        //SINGLETONE
        Singletone s1 =Singletone.getInstanta();
        Singletone s2 =Singletone.getInstanta();
        System.out.println(s1);
        System.out.println(s2);
        //SIMPLE FACTORY
        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz, "IL 10 BJZ");
        MijlocTransport tranvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tranvai, "PH 74 HHH");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz, "PH 75 HHH");
        System.out.println(autobuz.toString());
        System.out.println(tranvai.toString());
        System.out.println(troleibuz.toString());


    }
}
