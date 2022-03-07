package ro.ase.dice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends IReader{

    public AngajatiReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {

        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            readAplicant(scanner, angajat);
            angajat.setSalariu(scanner.nextInt());
            angajat.setOcupatie(scanner.next());

            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}