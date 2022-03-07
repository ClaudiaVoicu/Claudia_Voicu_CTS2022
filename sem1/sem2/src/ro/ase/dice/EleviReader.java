package ro.ase.dice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends IReader{

    public EleviReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Elev elev = new Elev();
            readAplicant(scanner,elev);
            elev.setClasa(scanner.nextInt());
            elev.setTutore(scanner.next());
            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}