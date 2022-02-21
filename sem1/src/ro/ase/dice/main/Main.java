package ro.ase.dice.main;

import ro.ase.dice.clase.Girafa;
import ro.ase.dice.clase.IngrijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

public class Main {
   public static void main(String[] args){
       IngrijitorZOO ingrijitor = new IngrijitorZOO("Marius");
       Zebra z1 = new Zebra("Elena");
       Zebra z2 = new Zebra("Alexandru");

       Girafa g1 = new Girafa("Emilia");
       Girafa g2 = new Girafa("Zet");
        ZOO zoo= new ZOO("Bucuresti zoo", ingrijitor);
       zoo.adaugaAnimal(z1);
       zoo.adaugaAnimal(z2);
       zoo.adaugaAnimal(g1);
       zoo.adaugaAnimal(g2);

       zoo.hranesteAnimale("banane");
   }
}
