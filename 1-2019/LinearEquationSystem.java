import java.util.Scanner;

public class LinearEquationSystem {
			
	public static void main(String[] args) {
		int variableNum = Integer.parseInt(args[0]);
		int[][] matrix = new int[variableNum][variableNum + 1];	 
		Scanner sc = new Scanner(System.in);
		
		for (int x = 0; x < variableNum; x++) {
			for (int y = 0; y < variableNum + 1; y++) {
				matrix[x][y] = sc.nextInt();
			}
		}
		System.out.println(java.util.Arrays.deepToString(matrix));
		
		
	}
}