package ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestPuertasJoyas {
  @Test
  public void test1() {
    int[] puertas = {1,2,3,4,5,6,7,8,9,10};
    assertEquals(26, PuertasJoyas.MinPrecio(puertas));
  }
}
