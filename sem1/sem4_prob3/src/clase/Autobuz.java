package clase;

public class Autobuz {
    public String setnumeSofer;
    private String numeSofer;
    private String nrInmatriculare;
    private String nrLinie;
    private Boolean openDoors;
    private Boolean oprireCapatLinie;
    private String textulDerulat;
    private int nrLocuri;

     Autobuz() {
        this.numeSofer = "Doru";
        this.nrInmatriculare = "B 12 AAB";
        this.nrLinie = "54";
        this.openDoors = Boolean.TRUE;
        this.oprireCapatLinie = Boolean.TRUE;
        this.textulDerulat = "textul derulat";
        this.nrLocuri = 20;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    void setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

    void setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

    void setTextulDerulat(String textulDerulat) {
        this.textulDerulat = textulDerulat;
    }

     void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrLinie='").append(nrLinie).append('\'');
        sb.append(", openDoors=").append(openDoors);
        sb.append(", oprireCapatLinie=").append(oprireCapatLinie);
        sb.append(", textulDerulat='").append(textulDerulat).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
