import java.io.FileReader;

public class LongestLine {
  public static void main(String[] args) {
    int maxLineLength = Integer.MIN_VALUE;
    String longestLineString = "";

    for (String i : args) {
      try {
        FileReader reader = new FileReader(i);
        java.util.Scanner sc = new java.util.Scanner(reader);

        while(sc.hasNextLine()) {
          String line = sc.nextLine();

          if (line.length() > maxLineLength) {
            maxLineLength = line.length();
            longestLineString = line;
          }

          sc.close();
          reader.close();
        }
      } catch(Exception e) {
        System.out.println(e.getMessage());
      }

    }
    System.out.println("Longest line: " + longestLineString);
  }
}
