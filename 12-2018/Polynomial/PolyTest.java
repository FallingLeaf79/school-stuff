public class PolyTest {
  public static void main(String[] args) {
    Polynomial a = new Polynomial(1, 5, 3, 7, 7);
    Polynomial b = new Polynomial(2, 17, 0, 5, 2);
    Polynomial x = new Polynomial(3, 7, 5);
    Polynomial y = new Polynomial(2, 27, 2);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("a + b = " + Polynomial.addPoly(a, b));
    System.out.println("a + b + x + y = " + Polynomial.addPoly(a, b, x, y));
    System.out.println("a - x = " + Polynomial.subtractPoly(a, x));
    System.out.println("x * y = " + Polynomial.multiplyPoly(x, y));
  }
}
