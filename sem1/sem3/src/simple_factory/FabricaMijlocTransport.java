package simple_factory;

public class FabricaMijlocTransport {
    public static MijlocTransport getMijlocTransport(TipMijlocTransport tipMijlocTransport, String nrInmatriculare){
        switch (tipMijlocTransport){
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tranvai:
                return new Tranvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
