package clase;

public class CardStb implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata efectuata cu cardul STB si suma de "+suma);

    }
}
