import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a % 2 == 0) {
			int ans = a / 2;
			ans = ans - 1;
			System.out.println(ans);
		}else {
			int ans = a / 2;
			System.out.println(ans);
		}
	}
}