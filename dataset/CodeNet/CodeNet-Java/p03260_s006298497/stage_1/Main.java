import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
 
		if (A != 2 && B != 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}