import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = new int [11];
		int r = sc.nextInt();
		int d = sc.nextInt();
		ary[0] = sc.nextInt();
		for(int i = 0; i < 10; i++){
			ary[i + 1] = ary[i] * r - d;
			System.out.println(ary[i + 1]);
		}
	}
}
