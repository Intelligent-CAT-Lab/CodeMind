
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
System.out.println("[INST]7;a;sc.nextInt();"+a);

			System.out.println("ABC" + a);
		}
	}
}
