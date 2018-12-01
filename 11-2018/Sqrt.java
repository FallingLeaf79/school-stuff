public class Sqrt {
  public static double guessResult(double base) {
    int baseInt = (int)(base);
    String digitsStr = Integer.toString(baseInt);
    int digitsInt = digitsStr.length();
    double ceiling = ((double)digitsInt/2);
    double guess = ((Math.pow(10, ceiling))/2);
    return guess;
    }
    public static double iteration(double guess, double base) {
      double newGuess = ((guess+(base/guess))/2);
      return newGuess;
    }
  public static void main (String[] args){
    double base = Double.parseDouble(args[0]);
    double precision = Double.parseDouble(args[1]);
    double guess = guessResult(base);
    double newGuess = iteration(guess, base);
    while (Math.abs(newGuess - guess) > (precision)) {
      guess = newGuess;
      newGuess = iteration(guess, base);
    }
    System.out.printf("Odmocnina %f je %f (+- %f).\n",
                      base, newGuess, precision);
  }
}
