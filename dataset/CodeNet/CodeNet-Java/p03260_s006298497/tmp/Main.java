import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
		sc.close();
 
		if (A != 2 && B != 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}