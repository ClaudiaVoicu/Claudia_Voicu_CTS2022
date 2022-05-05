package adapter_clase.clase.stb;

import adapter_obiecte.clase.metrou.ValidatorScanare;

public class ValidatorAdapter extends ValidatorScanare implements ValidatorSTB {


    @Override
    public void validareBilet() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void validareAbonament() {
        super.valideazaAbonamentMetrou();
    }
}
