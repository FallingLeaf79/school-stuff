import java.util.Arrays;

public class MathUtils {

  public static int min(int... numbers) {
    int min = Integer.MAX_VALUE;

    for (int i : numbers) {
      if (i < min) {
        min = i;
      }
    }

    return min;
  }

  public static int gcd(int... numbers) {
    if (numbers.length > 2) {
      return gcd(
        numbers[0],
        gcd(Arrays.copyOfRange(numbers, 1, numbers.length))
      );
    }

    numbers[0] = Math.abs(numbers[0]);
    numbers[1] = Math.abs(numbers[1]);

    if (numbers[0] == 0 || numbers[1] == 0) {
    return 0;

    } else if (numbers[0] < numbers[1]) {
      return gcd(numbers[0], numbers[1] - numbers[0]);

    } else if (numbers[0] > numbers[1]) {
      return gcd(numbers[0] - numbers[1], numbers[1]);

    } else if (numbers[0] == numbers[1]) {
      return numbers[0];

    } else throw new NumberFormatException();
  }

  public static int lcm(int... numbers) {
    if (numbers.length > 2) {
      return lcm(
        numbers[0],
        lcm(Arrays.copyOfRange(numbers, 1, numbers.length))
      );
      
    } else return (
        (Math.abs(numbers[0])
      / gcd(numbers[0], numbers[1]))
      * Math.abs(numbers[1])
    );
  }
}
