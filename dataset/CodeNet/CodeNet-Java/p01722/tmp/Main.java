import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);
		switch (n) {
		case 0:
			System.out.println(1);
			break;
		case 1:
			System.out.println(2);
			break;
		case 2:
			System.out.println(1);
			break;
		default:
			System.out.println(0);
			break;
		}
		sc.close();
	}

}