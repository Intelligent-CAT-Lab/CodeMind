import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String res = new Integer(a * b).toString();
		res += " ";
		res += (2*a + 2*b);
		System.out.println(res);
	}
}

