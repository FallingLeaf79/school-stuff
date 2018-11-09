public class xChooseY {
  public static void main (String[] args) {
    long x = Long.parseLong(args[0]);
    long y = Long.parseLong(args[1]);
    if (y > (x-y)) {
      y = x-y;
    } //(n*(n-1)*...(n-k+1))/(k*(k-1)*...*1)
    long result = 1L;
    for (int z = 0; z < y; z++) {
      result *= (x-z);
      result /= (y-z);
    }
    System.out.println(result);
  }
}
