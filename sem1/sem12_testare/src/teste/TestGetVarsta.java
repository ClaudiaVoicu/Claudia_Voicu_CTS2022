package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGetVarsta {
    @Test
    public void testRightM(){
        Persoana persoana = new Persoana("Andrei", "5000112365478");
        assertEquals(22, persoana.getVarsta());
    }
    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Florina", "4000101365478");
        assertEquals(222, persoana.getVarsta());
    }
    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Florina", "6220101365478");
        assertEquals(0, persoana.getVarsta());
    }
    @Test (expected = CNPInvalidException.class)
    public void testErrorGetVarsta(){
        Persoana persoana = new Persoana("Florina", "6230101365478");
        persoana.getVarsta();
    }
    @Test(timeout = 100)
    public void testPerformanceGetVarsta(){
        Persoana persoana = new Persoana("Florina", "6000112365478");
        persoana.getVarsta();
    }
    @Test
    public void testFormatGetVarsta(){
        Persoana persoana = new Persoana("Florina", "6210112365478");
        assertTrue(persoana.getVarsta()>= 0);
    }
    @Test
    public void testOrderGetVarsta(){
        Persoana persoana1 = new Persoana("Florina", "2980112365478");
        Persoana persoana2 = new Persoana("Florina", "6020112365478");
        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }
    @Test (expected = NullPointerException.class)
    public void testExistanceGetVarsta(){
        Persoana persoana = new Persoana("Florina", null);
        persoana.getVarsta();
    }
}
