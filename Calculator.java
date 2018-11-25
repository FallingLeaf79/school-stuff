public class Calculator {
  public static void main(String[] args) {      //4x5+3x2+2+5+4x7x15
    int product = 1;
    int sum = 0;
    String[] splitAdd = args[0].split("[+]");     //"4x5" "3x2" "2" "5" "4x7x15"
    for (int x = 0; x < splitAdd.length; x++) {
      String[] splitMultiply = splitAdd[x].split("x");
      for (int y = 0; y < splitMultiply.length; y++) {
        product = product * (Integer.parseInt(splitMultiply[y]));  
      }
      sum = sum + product;  
      product = 1;
    }
    System.out.println(sum); 
  }
}