package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrInmatriculare("B 33 SDS");
        autobuzBuilder.setOprireCapatLinie(Boolean.FALSE);
        autobuzBuilder.setNrLocuri(80);
        Autobuz autobuz1 = new AutobuzBuilder().setOpenDoors(Boolean.TRUE).build();
        Autobuz autobuz2 = autobuzBuilder.build();
        System.out.println(autobuz1);
        System.out.println(autobuz2);
    }
}
