package simple_factory;

public class Tranvai extends MijlocTransport {
    public Tranvai(String nrInmatriculare) {

        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tranvai{"+getNrInmatriculare());
        sb.append('}');
        return sb.toString();
    }
}
