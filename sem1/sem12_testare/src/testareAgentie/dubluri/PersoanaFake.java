package testareAgentie.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    String valoareGetSex;
    Integer valoareGetVarsta;
    Boolean valoareCheckCnp;

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(Integer valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareCheckCnp(Boolean valoareCheckCnp) {
        this.valoareCheckCnp = valoareCheckCnp;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareCheckCnp;
    }
}
