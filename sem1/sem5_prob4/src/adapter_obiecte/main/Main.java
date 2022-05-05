package adapter_obiecte.main;

import adapter_obiecte.clase.metrou.ValidatorMetrou;
import adapter_obiecte.clase.metrou.ValidatorScanare;
import adapter_obiecte.clase.stb.ValidatorAdapter;

public class Main {

    public static void main(String[] args) {
        ValidatorMetrou validatorMetrou = new ValidatorScanare();
        ValidatorAdapter adapter = new ValidatorAdapter(validatorMetrou);
        adapter.validareBilet();
        adapter.validareAbonament();
    }
}
