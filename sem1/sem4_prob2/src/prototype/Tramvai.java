package prototype;

public class Tramvai implements MijlocTransport{

    private String numeVatman;

    public Tramvai(String numeVamtan) {
        super();
        this.numeVatman = numeVamtan;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("numeVamtan='").append(numeVatman).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }
}
