package ro.ase.dice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends IReader{

    public StudentiReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {

        super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Student student = new Student();
            readAplicant(scanner,student);
            student.setAn_studii(scanner.nextInt());
            student.setFacultate(scanner.next());
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}