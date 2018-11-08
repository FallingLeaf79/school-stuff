public class Cross {
  public static void repeatStuff(char stuff, int repeat) {
    while (repeat > 0) {
      System.out.printf("%c", stuff);
      repeat--;
    }
  }

  public static void topBottom(int x) {
    for (int y = x; y > 0; y--) {
      repeatStuff(' ', (x*2));
      repeatStuff('X', x);
      System.out.println();
    }
  }

  public static void main(String[] args){
    int x = Integer.parseInt(args[0]);
    topBottom(x);

    for (int y = ((x/2)+1);y > 0; y--) {
      repeatStuff('X', ((x*4)+x));
      System.out.println();
    }

    topBottom(x);
  }
}
