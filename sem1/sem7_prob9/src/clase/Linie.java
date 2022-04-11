package clase;

public class Linie {
    private int nrLinie;
    private String primaStatie;
    private String ultimaLinie;

    public Linie(int nrLinie, String primaStatie, String ultimaLinie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaLinie = ultimaLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaLinie='").append(ultimaLinie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
