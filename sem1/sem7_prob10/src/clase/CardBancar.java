package clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata efectuata cu cardul bancar si suma de "+suma);
    }
}
