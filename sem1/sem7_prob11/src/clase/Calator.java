package clase;

public class Calator implements ICalator {
    private String nume;

    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(nume+ " a primit mesajul: "+ mesaj);
    }

    public Calator(String nume) {
        this.nume = nume;
    }
}
