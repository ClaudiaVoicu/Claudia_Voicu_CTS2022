package clase;

public class Autobuz {
    private String model;

    public void pleacaInCursa(int nrLinie){
        System.out.println("Autobuzul "+ model + " a plecat pe linia "+ nrLinie);

    }

    public Autobuz(String model) {
        this.model = model;
    }
}

