package clase;

public class Autobuz {
    private String numeSofer;
    private String model;
    private Integer nrLinie;
    private Integer nrLocuri;
    private String nrInmatriculare;
    private Boolean deschideUsi;
    private Boolean opresteCapat;

    Autobuz(String numeSofer, String model, Integer nrLinie, Integer nrLocuri, String nrInmatriculare, Boolean deschideUsi, Boolean opresteCapat) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrLinie = nrLinie;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare = nrInmatriculare;
        this.deschideUsi = deschideUsi;
        this.opresteCapat = opresteCapat;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", model='" + model + '\'' +
                ", nrLinie=" + nrLinie +
                ", nrLocuri=" + nrLocuri +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                ", deschideUsi=" + deschideUsi +
                ", opresteCapat=" + opresteCapat +
                '}';
    }
}
