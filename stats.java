public class stats {
    public static void main(String[] args) {
        double input;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        double values = 0;
        double sum = 0;
        //(note to self: figure out standard deviance)
        System.out.println("Vkladejte cisela oddelena klavesou ENTER, "
        + "pote potvrdte zmacknutim klaves CTRL+Z a ENTER pro vypocet" +
        " souctu, prumeru, nejvyssi a nejnizsi hodnoty a smerodatne odchylky");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextDouble()) {
            input = sc.nextDouble();
            values++;
            sum += input;
            if (input > max) {
              max = input;
            }
            if (input < min) {
              min = input;
            }
        }
        if (values == 0){
          System.err.println("Nebyly zadany zadne hodnoty.");
        }
        System.out.printf("Soucet hodnot je %f.\n", sum);
        System.out.printf("Nejnizsi hodnota je %f.\n", min);
        System.out.printf("Nejvyssi hodnota je %f.\n", max);
        System.out.printf("Prumer hodnot je %f.\n", sum / values);
    }
}
