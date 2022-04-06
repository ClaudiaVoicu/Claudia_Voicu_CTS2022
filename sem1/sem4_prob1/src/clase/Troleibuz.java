package clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Trolebibuz " + this.nrInmatriculare);
    }
}
