import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a==1) {
			System.out.println("Hello World");
		}
		else {
			int b=scan.nextInt();
			int c=scan.nextInt();
			System.out.println(b+c);
		}
		}
	}