package adapter_clase.clase.stb;

public class ValidatorNFC implements ValidatorSTB {


    @Override
    public void validareBilet() {
        System.out.println("Biletul a fost validat");
    }

    @Override
    public void validareAbonament() {
        System.out.println("Abonamentul a fost validat");
    }
}
