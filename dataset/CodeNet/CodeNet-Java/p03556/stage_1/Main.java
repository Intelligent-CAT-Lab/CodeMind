import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
var newVariable_0 = Math.sqrt(scanner.nextInt());var newVariable_1 = scanner.nextInt();		int r = (int) Math.sqrt(newVariable_1);
		System.out.println(r * r);
	}
}
