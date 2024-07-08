import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n2 = N / 2;
		int n3 = N / 3;
		int amari = N % 3;
		if (amari == 0) {
			System.out.println(N / 3);
		} else if (amari == 1) {
			System.out.println(N / 3);
		} else if (amari == 2) {
			System.out.println(N / 3);
		}
	}
}