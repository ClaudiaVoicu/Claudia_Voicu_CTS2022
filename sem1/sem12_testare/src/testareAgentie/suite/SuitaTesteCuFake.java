package testareAgentie.suite;

import clase.AgentieTurism;
import clase.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testareAgentie.categorii.TesteCuFake;
import testareAgentie.categorii.TestePentruBoundery;
import testareAgentie.teste.AgentieTurismTest;
import testareAgentie.teste.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TesteCuFake.class)
@Categories.ExcludeCategory(TestePentruBoundery.class)
public class SuitaTesteCuFake {
}
