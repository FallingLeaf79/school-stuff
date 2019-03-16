import java.util.Scanner;

public class Email {

	public static void main(String[] args) throws java.io.IOException {
		Scanner email = new java.util.Scanner(java.nio.file.Paths.get("email.txt"));

		while (email.hasNextLine()) {
			String nextThing = email.nextLine();

			if (nextThing.isEmpty()) {
				email.close();
				break;
			}

			else if (
				nextThing.startsWith("From:") ||
				nextThing.startsWith("Subject:")
			) {
				System.out.println(nextThing);
			}
		}
	}
}
