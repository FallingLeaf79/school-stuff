public class bars {
  public static int compareScale(int scale) {
    int out = (int)(Math.ceil((double)scale/60));
    return out;
  }
  public static void printBar(int x, int scale) {
    int length = x/scale;
    while (length > 0) {
      System.out.printf("X");
      length--;
    }
    System.out.println();
  }
  public static void main(String[]args) {
    awh.IntList input = awh.IntList.create();
    int max = 0;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    while (sc.hasNextInt()) {
      int newInt = sc.nextInt();
      input.add(newInt);
      if (newInt > max) {
        max = newInt;
      }
    }
    int scale = compareScale(max);
    for (int x = 0; x < (input.size()); x++){
      printBar((input.get(x)), scale);
    }
  }
}
