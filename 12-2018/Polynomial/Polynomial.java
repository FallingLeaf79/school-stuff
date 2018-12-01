public class Polynomial {
  private int tesseract;
  private int cube;
  private int square;
  private int line;
  private int point;

  public Polynomial(int a, int b, int c, int d, int e) {
    tesseract = a;
    cube = b;
    square = c;
    line = d;
    point = e;
  }
  public Polynomial(int a, int b, int c, int d) {
    cube = a;
    square = b;
    line = c;
    point = d;
  }
  public Polynomial(int a, int b, int c) {
    square = a;
    line = b;
    point = c;
  }
  public Polynomial(int a, int b) {
    line = a;
    point = b;
  }

  public int getTesseract() {
    return tesseract;
  }
  public int getCube() {
    return cube;
  }
  public int getSquare() {
    return square;
  }
  public int getLine() {
    return line;
  }
  public int getPoint() {
    return point;
  }

  public static Polynomial addPoly(Polynomial... poly) {
    int sumTesseract = 0;
    int sumCube = 0;
    int sumSquare = 0;
    int sumLine = 0;
    int sumPoint = 0;
    for (int x = 0; x < poly.length; x++) {
      sumTesseract += poly[x].getTesseract();
      sumCube += poly[x].getCube();
      sumSquare += poly[x].getSquare();
      sumLine += poly[x].getLine();
      sumPoint += poly[x].getPoint();
    }
    Polynomial sumPoly = new Polynomial(
      sumTesseract, sumCube, sumSquare, sumLine, sumPoint
    );
    return sumPoly;
  }
  public static Polynomial subtractPoly(Polynomial x, Polynomial y) {
    Polynomial difPoly = new Polynomial(
      (x.getTesseract()-(y.getTesseract())),
      (x.getCube() - y.getCube()),
      (x.getSquare() - y.getSquare()),
      (x.getLine() - y.getLine()),
      (x.getPoint() - y.getPoint())
    );
    return difPoly;
  }
  public static Polynomial multiplyPoly(Polynomial x, Polynomial y) {
    boolean hasTesseractOrCube = (
      x.getTesseract() != 0 ||
      x.getCube() !=0       ||
      y.getTesseract() != 0 ||
      y.getCube() !=0
    );
    if (hasTesseractOrCube) {
      throw new IllegalArgumentException(
      "Can't calculate for powers higher than second."
      );
    }
    int productTesseract = (x.getSquare() * y.getSquare());
    int productCube = (
      (x.getSquare() * y.getLine()) +
      (x.getLine() * y.getSquare())
    );
    int productSquare = (
      (x.getSquare() * y.getPoint()) +
      (x.getLine() * y.getLine()) +
      (x. getPoint() * y.getSquare())
    );
    int productLine = (
      x.getLine() * y.getPoint() +
      x.getPoint() * y.getLine()
    );
    int productPoint = (x.getPoint() * y.getPoint());
    Polynomial product = new Polynomial(
      productTesseract, productCube,
      productSquare,    productLine,
      productPoint
    );
    return product;
  }

  @Override
    public String toString() {
        return String.format(
        "%dx^4 + %dx^3 + %dx^2 + %dx +%d", tesseract, cube, square, line, point
      );
    }
}
