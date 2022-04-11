package clase;

public class Autobuz implements AutobuzLinie{

    private String model;
    private String an;
    private int nrLocuri;

    @Override
    public void descrie(Linie linie) {
        System.out.println(this.toString() + " "+ linie.toString());
    }

    public Autobuz(String model, String an, int nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", an='").append(an).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
