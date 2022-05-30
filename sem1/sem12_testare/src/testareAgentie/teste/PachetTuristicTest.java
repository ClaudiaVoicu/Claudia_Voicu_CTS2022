package testareAgentie.teste;

import clase.IPersoana;
import clase.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testareAgentie.categorii.TesteCuFake;
import testareAgentie.categorii.TestePentruBoundery;
import testareAgentie.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(TesteCuFake.class)
    public void poateRezervaRightTrueTest(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "destinatie", 190.0);
        assertTrue(pachetTuristic.poateRezerva());

    }
    @Test
    @Category(TesteCuFake.class)
    public void poateRezervaRightFalseTest(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(17);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "destinatie", 190.0);
        assertFalse(pachetTuristic.poateRezerva());

    }

    @Test
    @Category({TesteCuFake.class, TestePentruBoundery.class})
    public void poateRezervaBounderyTest() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "destinatie", 190.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
    @Test
    @Category(TesteCuFake.class)
    public void aplicaDiscountTest(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "destinatie", 190.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(190.0,pachetTuristic.getPret(),0.01);
    }
    @Test
    @Category(TesteCuFake.class)
    public void aplicaDiscounPensionartTest(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(78);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "destinatie", 190.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(171.0,pachetTuristic.getPret(),0.01);
    }

}
