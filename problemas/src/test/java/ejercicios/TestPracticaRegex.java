package ejercicios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPracticaRegex {

  @Test
  public void validPins() {
    assertEquals(true, PracticaRegex.validatePin("1234"));
    assertEquals(true, PracticaRegex.validatePin("0000"));
    assertEquals(true, PracticaRegex.validatePin("1111"));
    assertEquals(true, PracticaRegex.validatePin("123456"));
    assertEquals(true, PracticaRegex.validatePin("098765"));
    assertEquals(true, PracticaRegex.validatePin("000000"));
    assertEquals(true, PracticaRegex.validatePin("090909"));
  }

  @Test
  public void nonDigitCharacters() {
    assertEquals(false, PracticaRegex.validatePin("a234"));
    assertEquals(false, PracticaRegex.validatePin(".234"));
  }

  @Test
  public void invalidLengths() {
    assertEquals(false, PracticaRegex.validatePin("1"));
    assertEquals(false, PracticaRegex.validatePin("12"));
    assertEquals(false, PracticaRegex.validatePin("123"));
    assertEquals(false, PracticaRegex.validatePin("12345"));
    assertEquals(false, PracticaRegex.validatePin("1234567"));
    assertEquals(false, PracticaRegex.validatePin("-1234"));
    assertEquals(false, PracticaRegex.validatePin("1.234"));
    assertEquals(false, PracticaRegex.validatePin("00000000"));
  }

}
