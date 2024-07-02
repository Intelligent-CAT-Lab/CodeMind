import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
System.out.println("[INST]6;N;sc.nextInt();"+N);
		int i = sc.nextInt();
System.out.println("[INST]7;i;sc.nextInt();"+i);
		sc.close();
		
		System.out.println(N-i+1);
	}
}