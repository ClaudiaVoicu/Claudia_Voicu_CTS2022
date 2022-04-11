package clase;



public class Validator {
    ModPlata modPlata;
    private float pret;

    public Validator(float pret) {
        this.pret = pret;
        this.modPlata = new CardStb();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void validareCalatorie(){
        this.modPlata.plateste(this.pret);
    }
}
