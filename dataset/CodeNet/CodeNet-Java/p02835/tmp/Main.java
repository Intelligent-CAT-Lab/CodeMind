import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
		int c = sc.nextInt();
System.out.println("[INST]8;c;sc.nextInt();"+c);
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}
