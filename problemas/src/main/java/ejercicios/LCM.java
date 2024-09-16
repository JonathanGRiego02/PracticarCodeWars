package ejercicios;

public class LCM {

  // Buscamos el denominador más grande en las fracciones
  static long FindDemMax (long[][] lst) {
    long den_max = lst[0][1];
    for (long[] fracciones : lst) {
      if (den_max < fracciones[1]) {
        den_max = fracciones[1];
      }
    }
    return den_max;
  }

  public static String convertFrac(long[][] lst) {
    long max = FindDemMax(lst);
    long comprobante = max;
    int contador = 0;

    // No acabaremos el bucle hasta que lleguemos al final de la matriz de fracciones.
    // Llegar al final significara que el multiplo es comun para todos, por ende la solucion
    while (contador != lst.length) {
      // Si deja de ser multiplo comun, volvemos a empezar probando con el siguiente
      if (comprobante % lst[contador][1] != 0) {
        contador = 0;
        comprobante += max;
      } else {
        contador++;
      }
    }

    StringBuilder result = new StringBuilder();

    // Generamos la string con el formato deseado usando StringBuilder
    for (long[] pair : lst) {
      result.append("(")
              .append(pair[0] * (comprobante / pair[1]))
              .append(",")
              .append(comprobante)
              .append(")");
    }

    // Convertimos StringBuilder a String
    return result.toString();
  }
}

