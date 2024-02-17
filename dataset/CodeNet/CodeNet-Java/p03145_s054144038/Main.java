/*
 * 直角三角形の面積を求める
 */
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//変数定義
		int a,b,c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.println(a*b/2);

	}
}