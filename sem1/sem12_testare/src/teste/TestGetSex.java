package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGetSex {
    @Test
    public void testRight(){
        Persoana persoana = new Persoana("Andrei", "5000112365478");
        assertEquals("M", persoana.getSex());
    }
    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Matei", "1000112365478");
        assertEquals("M", persoana.getSex());
    }
    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Florina", "6000112365478");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheck(){
        Persoana persoana = new Persoana("Florina", "6000112365478");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2 != 0 ? "M":"F", persoana.getSex());
    }
    @Test (expected = CNPInvalidException.class)
    public void testError(){
        Persoana persoana = new Persoana("Florina", "0000112365478");
        persoana.getSex();
    }
    @Test(expected = CNPInvalidException.class)
    public void testErrorLitera(){
        Persoana persoana = new Persoana("Florina", "a000112365478");
        persoana.getSex();
    }
    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Florina", "6000112365478");
        persoana.getSex();
    }
    @Test
    public void testFormatGetSex(){
        Persoana persoana = new Persoana("Florina", "6000112365478");
        assertEquals(1, persoana.getSex().length());
    }
    @Test
    public void testRangeGetSex(){
        Persoana persoana = new Persoana("Florina", "9000112365478");
        assertEquals("N/A", persoana.getSex());
    }
    @Test (expected = NullPointerException.class)
    public void testExistanceGetSex(){
        Persoana persoana = new Persoana("Florina", null);
        persoana.getSex();
    }

}
