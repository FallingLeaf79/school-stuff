public class Prime {
	public static void main(String[] args) {
		System.out.println("Napiste kladne cele cislo a potvrdte klavesou ENTER.");
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		while (scanner.hasNextInt()) {
			int cislo = scanner.nextInt();
			int delitel = 2;

			if (cislo < 1) {
				System.err.println("Zvolte kladne cislo, prosim.");
			}
			else if (cislo == 1) {
				System.out.println("1 neni prvocislo.");
			}
			else for (int zbytek = cislo%delitel; cislo >= delitel; delitel++) {
				if ((cislo > delitel) && (zbytek == 0)) {
					System.out.printf("%d neni prvocislo.\n", cislo);
					}
				else if ((cislo == delitel) && (zbytek != 0)){
					System.out.printf("%d je prvocislo!\n", cislo);
					}
			}
		}
	}
}
