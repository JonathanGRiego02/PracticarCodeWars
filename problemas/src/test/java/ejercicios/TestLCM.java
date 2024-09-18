package ejercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class TestLCM {

  @Test
  public void test_fractions() throws Exception {
    long[][] lst;
    //Testing [[69, 130], [87, 1310], [30, 40]]
    lst = new long[][] {{67, 134}, {75, 375}, {15, 30}, {59, 118}, {16, 80}};
    assertEquals("(18078,34060)(2262,34060)(25545,34060)", LCM.convertFrac(lst));
  }

}
