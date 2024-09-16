package ejercicios;
import static java.util.Arrays.stream;

public class HighestLowest {
  public static String highAndLow(String numbers) {
    // El stream es basicamente una manera de hacerle algo a toda la string sin necesidad de ir haciendo un bucle
    // Basicamente divide en un array la string por espacios y luego los convierte en enteros.
    // Con summaryStatistics coge datos sobre esta string (como el máximo y el minimo que es lo que queremos)
    var numeros_ordenados = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
    return numeros_ordenados.getMax() + " " + numeros_ordenados.getMin();

  }
}
