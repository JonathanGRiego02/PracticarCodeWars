package ejercicios;
/*
Refactorizaciones:
- Intentar no tener que recorrer el array tantas veces.
- En el caso actual, se podria dividir el array de antes para no tener que hacer el check de si va para arriba o para abajo (?)
 */

public class PuertasJoyas {

  public static int MinPrecio(int[] puertas) {
    int min = 0;
    int sumatorio_derecha = 0;
    int sumatorio_izquierda = 0;
    int puertas_size = puertas.length;
    // Bucle para encontrar el valor mínimo
    for (int i = 0 ; i < puertas_size; i++) {

      for (int j = i ; j < puertas_size; j++) {
        sumatorio_derecha += puertas[j];
      }
      if (sumatorio_derecha != puertas[puertas_size - 1]) {
        sumatorio_derecha -= puertas[i + 1];
      }

      for (int j = i ; j > 0; j--) {
        sumatorio_izquierda += puertas[j];
      }

      if (sumatorio_izquierda != 0) {
        sumatorio_derecha -= puertas[i - 1];
      }

      int sumatorio_peor;

      System.out.println("Minimo actual: " + min);
      System.out.println("Posicion: " + puertas[i]);
      System.out.println("Sumatorio derecha: " + sumatorio_derecha);
      System.out.println("Sumatorio izquierda: " + sumatorio_izquierda);
      System.out.println("-----------------");

      sumatorio_peor = Math.max(sumatorio_derecha, sumatorio_izquierda);

      if (sumatorio_peor < min || min == 0) {
      }

      sumatorio_derecha = 0;
      sumatorio_izquierda = 0;
    }

    return min;
  }

}
