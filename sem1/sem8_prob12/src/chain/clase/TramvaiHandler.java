package chain.clase;


public class TramvaiHandler extends Handler {
    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti sa folosesti tramvaiull!");}
        else{
            super.handler.afisareMijlocTransport(distanta);//pasare responsabilitate
        }
    }
}
