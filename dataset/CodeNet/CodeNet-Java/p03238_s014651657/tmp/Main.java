import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
System.out.println("[INST]4;a;scan.nextInt();"+a);
		if(a==1) {
			System.out.println("Hello World");
		}
		else {
			int b=scan.nextInt();
System.out.println("[INST]9;b;scan.nextInt();"+b);
			int c=scan.nextInt();
System.out.println("[INST]10;c;scan.nextInt();"+c);
			System.out.println(b+c);
		}
		}
	}