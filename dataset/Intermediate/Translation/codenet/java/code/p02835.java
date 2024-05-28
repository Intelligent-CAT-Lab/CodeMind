import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}
