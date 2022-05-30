package testareAgentie.dubluri;

import clase.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private boolean valoareGetRezervare;
    private double valoareGetPret;

    public void setValoareGetRezervare(boolean valoareGetRezervare) {
        this.valoareGetRezervare = valoareGetRezervare;
    }

    public void setValoareGetPret(double valoareGetPret) {
        this.valoareGetPret = valoareGetPret;
    }

    @Override
    public boolean poateRezerva() {
        return this.valoareGetRezervare;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return this.valoareGetPret;
    }
}
