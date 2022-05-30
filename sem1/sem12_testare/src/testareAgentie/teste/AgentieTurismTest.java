package testareAgentie.teste;

import clase.AgentieTurism;
import clase.IPachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testareAgentie.categorii.TesteCuDummy;
import testareAgentie.categorii.TesteCuFake;
import testareAgentie.dubluri.PachetDummy;
import testareAgentie.dubluri.PachetFake;

import static org.junit.Assert.assertEquals;

public class AgentieTurismTest {
    @Test
    @Category(TesteCuDummy.class)
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetDummy = new PachetDummy();

        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1, agentieTurism.getNumarPacheteTuristice());
    }
    @Test
    @Category(TesteCuFake.class)
    public void testCalculareSumaTotalPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake1.setValoareGetPret(3000.0);
        pachetFake2.setValoareGetPret(4500.0);

        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(7500.00, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }
}
