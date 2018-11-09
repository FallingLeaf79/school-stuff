public class xChooseY {
  public static long factorial(long x) {
    long out = 1L;
    while (x > 0) {
      out = out*x;
      x--;
    }
    return out;
  }

  public static void main (String[] args) {
    long x = Long.parseLong(args[0]);
    long y = Long.parseLong(args[1]);
    if (x >= y && x >= 0 && y >= 0) {
      long result = (factorial(x) / (factorial(y)*factorial(x-y)));
      System.out.println(result);
    }
    else {
      System.out.println("0");
    }
  }
}
