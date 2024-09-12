package ejercicios;

public class PhoneNumber {
  public static String createPhoneNumber(int[] numbers) {
    String phone_number = "(" + String.valueOf(numbers[0]) + String.valueOf(numbers[1]) + String.valueOf(numbers[2]) + ") " + String.valueOf(numbers[3]) + String.valueOf(numbers[4])
            + String.valueOf(numbers[5]) + "-" + String.valueOf(numbers[6]) + String.valueOf(numbers[7]) + String.valueOf(numbers[8]) + String.valueOf(numbers[9]);
    return phone_number;
  }
}
