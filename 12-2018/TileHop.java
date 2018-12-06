public class TileHop {
  public static final int FIELD_SIZE = 42;
  public static final int[] HOP = new int[] {3, 5};

  public static void findNextMove(int index, int[] field, int[] HOP) {
    for (int i = 1; i < field.length; i++) {
      if (field[i] == index) {
        for (int j = 0; j < HOP.length; j++) {
          if (i > HOP[j] && field[i - HOP[j]] == 0) {
            field[i - HOP[j]] = index + 1;
          }
          if (i + HOP[j] < field.length && field[i + HOP[j]] == 0) {
            field[i + HOP[j]] = index + 1;
          }
        }
      }
    }
  }

  public static boolean hasEmpty(int[] field) {
    for (int i = 1; i < field.length; i++) {
      if (field[i] == 0) {
        return true;
      }
    }
    return false;
  }

  public static void printField(int[] field) {
    System.out.print("0 ");
    for (int i = 1; i < field.length; i++) {
      if (field[i] == 0) {
        System.out.print("- ");
      }
      else System.out.print(field[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] field = new int[FIELD_SIZE];
    for (int i = 0; i < HOP.length; i++) {
      field[HOP[i]] = 1;
    }
    printField(field);
    for (int j = 1; hasEmpty(field); j++) {
      findNextMove(j, field, HOP);
      printField(field);
    }
  }
}
