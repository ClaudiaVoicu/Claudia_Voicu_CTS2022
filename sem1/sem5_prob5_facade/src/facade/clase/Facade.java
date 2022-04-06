package facade.clase;

public class Facade {
    private Autobuz autobuz;

    public Facade() {
        autobuz = new Autobuz();
    }

    public void deschideToateUsile(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void liberToateUsile(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }

}
