public class xChooseY {
  public static int factorial(int x) {
    int out = 1;
    while (x > 0) {
      out = out*x;
      x--;
    }
    return out;
  }

  public static void main (String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    if (x >= y && x >= 0 && y >= 0) {
      int result = (factorial(x) / (factorial(y)*factorial(x-y)));
      System.out.println(result);
    }
    else {
      System.out.println("0");
    }
  }
}
