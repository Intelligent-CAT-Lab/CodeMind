import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			System.out.println(String.format("%d %d", Math.min(Math.min(a, b), c), Math.max(Math.max(a, b), c)));
		}
	}
}
