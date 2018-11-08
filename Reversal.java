public class Reversal {
  public static void main (String[] args) {
    awh.IntList num = awh.IntList.create();
    java.util.Scanner sc = new java.util.Scanner(System.in);
    while (sc.hasNextInt()) {
      num.add(sc.nextInt());
    }
    num.reverse();
    System.out.println(num);
  }
}
