package ejercicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestPhoneNumber {

  @Test
  public void test1() {
    assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }
}
