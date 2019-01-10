/* This program prints several quadratic equations either on screen or into
 * an HTML file. It implements the QuadraticEquationPrinter interface
 * in the cz.alisma.alej.prog package, which is then used by
 * the QuadraticEquationGenerator from the same package.
 * The package can be downloaded here:
 * https://alej.alisma.cz/prog1/pg13/pg13.jar
 */

import cz.alisma.alej.prog.*;
import java.io.IOException;
import java.nio.file.*;

public class Rovnice {

  private static class ScreenPrinter implements QuadraticEquationPrinter {
    public void printHeader(int count) {
      return;
    }

    public void printEquation(int a, int b, int c, int x1, int x2) {
      System.out.printf("%dx^2 + %dx + %d = 0; \tx = %d, %d \n" , a, b, c, x1, x2);
    }
    public void printFooter() {
      return;
    }
  }

  private static class HtmlPrinter implements QuadraticEquationPrinter {
    Path path = Paths.get("output.html");

    public void printHeader(int count) {
      String header = String.format(
        "<!DOCTYPE html>\n<html>\n<head>\n" +
        "<title>%d quadratic equations</title>\n" +
        "</head>\n<body>\n<table>\n", count
      );

        byte[] headerBytes = header.getBytes();
        try {
          Files.write(path, headerBytes);
        } catch(IOException e) {
          System.err.print("An IOException occured:" + e.getMessage());
        }
    }
    public void printEquation(int a, int b, int c, int x1, int x2) {
      String equation = String.format(
        "<tr>\n<td>%dx^2 + %dx + %d = 0 </td>\n<td>x = %d, %d</td>\n</tr>\n",
        a, b, c, x1, x2
      );

        byte[] equationBytes = equation.getBytes();
        try {
          Files.write(path, equationBytes, StandardOpenOption.APPEND);
        } catch(IOException e) {
          System.err.print("An IOException occured:" + e.getMessage());
        }
    }

    public void printFooter() {
      String footer = String.format(
        "</table>\n</body>\n</html>"
      );

        byte[] footerBytes = footer.getBytes();
        try {
          Files.write(path, footerBytes, StandardOpenOption.APPEND);
        } catch(IOException e) {
          System.err.print("An IOException occured:" + e.getMessage());
        }
    }

  }

  public static void main(String[] args) {
    QuadraticEquationPrinter printer = (
    args.length > 0 && (args[0].equals("HTML") || args[0].equals("html"))
    ) ? new HtmlPrinter() : new ScreenPrinter();

    QuadraticEquationGenerator.generate(10, printer);
  }
}
