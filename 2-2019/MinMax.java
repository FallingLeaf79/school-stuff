import java.io.FileReader;

public class MinMax {

	public static void main(String[] args) throws java.io.IOException {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		FileReader reader = new FileReader("num.txt");
		java.util.Scanner sc = new java.util.Scanner(reader);
		
		while (sc.hasNextInt()) {
			int next = sc.nextInt();
			
			if (next > max) {
				max = next;
			}
			
			if (next < min) {
				min = next;
			}
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}
