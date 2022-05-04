package simple_factory;

public class Autobuz extends MijlocTransport{

    public Autobuz(String nrInmatriculare) {

        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{"+ getNrInmatriculare());
        sb.append('}');
        return sb.toString();
    }
}
