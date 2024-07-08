import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
var newVariable_0 = sc.nextInt();			odd += newVariable_0 % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}

