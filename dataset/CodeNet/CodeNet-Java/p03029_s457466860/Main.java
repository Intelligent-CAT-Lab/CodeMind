import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();

		sc.close();

		p = a * 3 + p;

		System.out.print(p / 2);

	}

}
