import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
System.out.println("[INST]8;None;sc.nextInt();"+sc.nextInt());
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}

