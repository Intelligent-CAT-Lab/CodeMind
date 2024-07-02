import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		int r = (int) Math.sqrt(scanner.nextInt());
System.out.println("[INST]11;None;Math.sqrt(scanner.nextInt());"+Math.sqrt(scanner.nextInt()));
System.out.println("[INST]11;None;scanner.nextInt();"+scanner.nextInt());
		System.out.println(r * r);
	}
}
