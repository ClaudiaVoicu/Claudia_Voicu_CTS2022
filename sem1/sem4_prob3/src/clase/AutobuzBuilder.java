package clase;

public class AutobuzBuilder implements Builder{
    private Autobuz autobuz;
    public AutobuzBuilder(){
        autobuz = new Autobuz();
    }

    @Override
    public Autobuz build() {
        return this.autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        autobuz.setnumeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        autobuz.setNrInmatriculare (nrInmatriculare);
        return this;
    }

    public AutobuzBuilder setNrLinie(String nrLinie) {
        autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setOpenDoors(Boolean openDoors) {
        autobuz.setOpenDoors(openDoors);
        return this;
    }

    public AutobuzBuilder setOprireCapatLinie(Boolean oprireCapatLinie) {
       autobuz.setOprireCapatLinie(oprireCapatLinie);
       return this;
    }

    public AutobuzBuilder setTextulDerulat(String textulDerulat) {
        autobuz.setTextulDerulat(textulDerulat);
        return this;
    }

    public AutobuzBuilder setNrLocuri(int nrLocuri) {
        autobuz.setNrLocuri(nrLocuri);
        return this;
    }
}
