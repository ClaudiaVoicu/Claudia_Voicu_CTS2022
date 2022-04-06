package adapter_obiecte.clase.stb;

import adapter_obiecte.clase.metrou.ValidatorMetrou;
import adapter_clase.clase.stb.ValidatorSTB;

public class ValidatorAdapter implements ValidatorSTB {
    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareBilet() {
        validatorMetrou.valideazaBiletMetrou();
    }

    @Override
    public void validareAbonament() {
        validatorMetrou.valideazaAbonamentMetrou();
    }
}
