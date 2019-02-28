import java.io.PrintWriter;

public class Multiples {

  public static void main(String[] args) throws java.io.IOException {
    PrintWriter writer = new PrintWriter("multiples.txt");
    int line = 0;

    for (int i = 3; i < 1000; i += 3) {
      writer.print(i + ", ");
      line++;
      if (line == 10) {
        writer.println();
        line = 0;
      }
    }
    writer.close();
  }
}
