import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a + b < 10) {
			System.out.print(a + b);
		} else {
			System.out.print("error");
		}

	}
}