
public class Freq {

	public static void main(String[] args) {
		
		java.util.Map<Integer,Integer> freq = new java.util.HashMap<Integer, Integer>();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			
			if (freq.containsKey(x)) {
				freq.put(x, freq.get(x) + 1);
			} else {
				freq.put(x, 1);
			}
			
		}
		for (int k : freq.keySet()) {
			System.out.printf("%d\t%dx\n", k, freq.get(k));
		}
	}

}
