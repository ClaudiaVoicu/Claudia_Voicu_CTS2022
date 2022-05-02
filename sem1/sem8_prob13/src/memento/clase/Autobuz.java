package memento.clase;

public class Autobuz {
    private String numeSofer;
    private float consumMediu;
    private int anFabricatie;
    private String model;

    public Autobuz(String numeSofer, float consumMediu, int anFabricatie, String model) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.anFabricatie = anFabricatie;
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setMementoAutobuz(MementoAutobuz mementoAutobuz){
        this.numeSofer= mementoAutobuz.getNumeSofer();
        this.consumMediu=mementoAutobuz.getConsumMediu();
    }
    public MementoAutobuz createMementoAutobuz(){
        MementoAutobuz mementoAutobuz = new MementoAutobuz(this.numeSofer, this.consumMediu);
        return mementoAutobuz;
    }
}
