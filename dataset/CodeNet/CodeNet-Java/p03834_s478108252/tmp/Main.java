import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
System.out.println("[INST]6;s;scanner.next();"+s);
			System.out.println(s.replaceAll(",", " "));
		}
	}
}
