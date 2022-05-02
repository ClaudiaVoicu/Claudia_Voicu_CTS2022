package main;

import clase.MijlocTransportPeSine;
import clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();
        tramvai.parcurgereTraseu();
        tramvai.parcurgereTraseuInvers();

    }
}
