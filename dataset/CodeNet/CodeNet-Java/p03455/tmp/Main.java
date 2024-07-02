import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
System.out.println("[INST]6;X;sc.nextLong();"+X);
		long Y = sc.nextLong();
System.out.println("[INST]7;Y;sc.nextLong();"+Y);
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}