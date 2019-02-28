import java.io.PrintWriter;

public class OddEven {
  public static void main(String[] args) throws java.io.IOException {
    int max = Integer.parseInt(args[0]);

    PrintWriter odd = new PrintWriter ("odd.txt");
    PrintWriter even = new PrintWriter ("even.txt");

    for (int i = 1; i < max; i++) {

      if (i % 2 == 0) {
        even.println(i);
      } else {
        odd.println(i);
      }
    }

    odd.close();
    even.close();
  }
}
