import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void singleNumberMin() {
        assertEquals(2, MathUtils.min(2));
    }

    @Test
    public void sortedNumbersMin() {
        assertEquals(3, MathUtils.min(3, 4, 5));
    }

    @Test
    public void unsortedNumbersMin() {
        assertEquals(1, MathUtils.min(4, 3, 7, 1, 5));
    }

    @Test
    public void zeroIsTheMinimumMin() {
        assertEquals(0, MathUtils.min(3, 0, 2));
    }

    @Test
    public void negativeNumbersMin() {
        assertEquals(-3, MathUtils.min(-1, -2, -3));
    }

    @Test
    public void multipleMinimumsMin() {
        assertEquals(-42, MathUtils.min(-17, -42, -3, -42, 34));
    }



    @Test
    public void sameNumberGcd() {
      assertEquals(5, MathUtils.gcd(5, 5));
    }

    @Test
    public void twoPrimesGcd() {
      assertEquals(1, MathUtils.gcd(3, 17));
    }

    @Test
    public void twoNonPrimesGcd() {
      assertEquals(15, MathUtils.gcd(1785, 2460));
    }

    @Test
    public void primeAndNonPrimeGcd() {
      assertEquals(1, MathUtils.gcd(5501, 2560));
    }

    @Test
    public void lowerFirstGcd() {
      assertEquals(20, MathUtils.gcd(1460, 1560));
    }

    @Test
    public void biggerFirstGcd() {
      assertEquals(3, MathUtils.gcd(24, 21));
    }

    @Test
    public void multipleNumbersGcd() {
      assertEquals(4, MathUtils.gcd(564, 8564, 2560));
    }

    @Test
    public void negativeNumberGcd() {
      assertEquals(2, MathUtils.gcd(-4, 6));
    }

    @Test
    public void multipleNegativeNumbersGcd() {
      assertEquals(17, MathUtils.gcd(-527, -323));
    }

    @Test
    public void multipleNumbersOneNegativeGcd() {
      assertEquals(4, MathUtils.gcd(2524, -428, 284));
    }

    @Test
    public void multipleNumbersTwoNegativeGcd() {
      assertEquals(17, MathUtils.gcd(17, -34, -102));
    }

    @Test
    public void zeroGcd() {
      assertEquals(0, MathUtils.gcd(0, 5));
    }



    @Test
    public void sameNumberLcm() {
      assertEquals(4, MathUtils.lcm(4, 4));
    }

    @Test
    public void twoPrimesLcm() {
      assertEquals(36149, MathUtils.lcm(37, 977));
    }

    @Test
    public void twoNonPrimesLcm() {
      assertEquals(8235770, MathUtils.lcm(4285, 1922));
    }

    @Test
    public void primeAndNonPrimeLcm() {
      assertEquals(46832, MathUtils.lcm(2927, 16));
    }

    @Test
    public void smallerFirstLcm() {
      assertEquals(406, MathUtils.lcm(14, 29));
    }

    @Test
    public void biggerFirstLcm() {
      assertEquals(195, MathUtils.lcm(15, 13));
    }

    @Test
    public void multipleNumbersLcm() {
      assertEquals(17024, MathUtils.lcm(128, 4256, 152));
    }

    @Test
    public void negativeNumberLcm() {
      assertEquals(24, MathUtils.lcm(-12, 8));
    }

    @Test
    public void multipleNegativeNumbersLcm() {
      assertEquals(146682, MathUtils.lcm(-843, -522));
    }

    @Test
    public void multipleNumbersOneNegativeLcm() {
      assertEquals(928200, MathUtils.lcm(2040, -525, 13));
    }

    @Test
    public void multipleNumbersTwoNegativeLcm() {
      assertEquals(1064, MathUtils.lcm(38, -56, -19));
    }

    @Test(expected = ArithmeticException.class)
    public void zeroLcm() {
        MathUtils.lcm(7, 0);
    }
}
