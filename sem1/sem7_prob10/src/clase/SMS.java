package clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata efectuata prin SMS si suma de "+suma);

    }
}
