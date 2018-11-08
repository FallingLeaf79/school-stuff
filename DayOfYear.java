public class DayOfYear {
  public static boolean isLeap(int year) {
    if ((year % 4) == 0) {
      if ((year % 100) == 0) {
        if ((year % 400) == 0) {
          return true;
        }
        else {
          return false;
        }
      }
      else {
        return true;
      }
    }
    else {
      return false;
    }
  }

  public static int lengthOfMonth(int month, boolean leap) {
    if ((month == 1) ||
        (month == 3) ||
        (month == 5) ||
        (month == 7) ||
        (month == 8) ||
        (month == 10) ||
        (month == 12)) {
          return 31;
    }
    else if ((month == 4) ||
             (month == 6) ||
             (month == 9) ||
             (month == 11)) {
               return 30;
    }
    else if (month == 2) {
      if (leap) {
        return 29;
      }
      else {
        return 28;
      }
    }
    else return 0;
  }

  public static void main (String[] args) {
    int year = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);
    int day = Integer.parseInt(args[2]);
    int output = 0;
    for (int x = month - 1; x > 0; x--) {
      output = output + lengthOfMonth(x, isLeap(year));
    }
    output = output + day;
    if ((month > 12) || (month < 1)) {
      System.err.printf("Neplatne cislo mesice.");
    }
    else if ((day > lengthOfMonth(month, isLeap(year))) || (day < 1)) {
      System.err.printf("Neplatne cislo dne.");
    }
    else System.out.printf("Tento den je %d. v roce %d.", output, year);
    if (isLeap(year)) {
      System.out.println(" Tento rok je prestupny.");
    }
    else {
      System.out.println(" Tento rok neni prestupny.");
    }
  }
}
