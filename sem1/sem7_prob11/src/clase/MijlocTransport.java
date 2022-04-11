package clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> listaCalatori;
    private String nrLinie;


    public MijlocTransport( String nrLinie) {
        this.listaCalatori = new ArrayList<>();
        this.nrLinie = nrLinie;
    }

    public void adaugaCalator(ICalator calator){
        listaCalatori.add(calator);
    }
    public void stergeCalator(ICalator calator){
        listaCalatori.remove(calator);

    }

    public void trimiteMesaj( String mesaj){
        for( ICalator c: listaCalatori) {
            c.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie(){
        trimiteMesaj("Autobuzul numarul "+ nrLinie+ " a plecat de la capatul liniei!");
    }



}
