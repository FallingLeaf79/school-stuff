public class max {
    public static void main(String[] args) {
        int input = Integer.MIN_VALUE;
        int maxnum = Integer.MIN_VALUE;
        System.out.println("Vkladejte cisla, oddelena klavesou ENTER. " +
        "Pote stisknete CTRL+Z a ENTER pro vypsani nejvyssiho cisla.");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
          input = sc.nextInt();
          if (input > maxnum) {
            maxnum = input;
          }
        }
        if (maxnum > Integer.MIN_VALUE) {
          System.out.printf("Nejvyssi cislo je %d.", maxnum);
        }
        else {
          System.err.println("Nebylo zadano zadne cislo.");
        }
    }
}
