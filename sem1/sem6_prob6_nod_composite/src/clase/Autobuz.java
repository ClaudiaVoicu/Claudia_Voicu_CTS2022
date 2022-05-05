package clase;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Autobuz implements MijlocTransport {
    private String model;
    private String producator;
    private int nrLocuri;

    @Override
    public void afiseazaDescriere() {

        System.out.println(toString());
    }

    public Autobuz(String model, String producator, int nrLocuri) {
        this.model = model;
        this.producator = producator;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws NotImplementedException {
        throw new NotImplementedException();
    }

    @Override
    public void stergeMijlocTransport(MijlocTransport mijlocTransport) throws NotImplementedException {
        throw new NotImplementedException();
    }

    @Override
    public MijlocTransport getMijlocTransport(int index) throws NotImplementedException {
        throw new NotImplementedException();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", producator='").append(producator).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}