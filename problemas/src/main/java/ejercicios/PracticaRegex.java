package ejercicios;

public class PracticaRegex {

  public static boolean validatePin(String pin) {
    // $ es el final de la String
    return pin.matches("^\\d{4}$|\\d{6}$");
  }

}
