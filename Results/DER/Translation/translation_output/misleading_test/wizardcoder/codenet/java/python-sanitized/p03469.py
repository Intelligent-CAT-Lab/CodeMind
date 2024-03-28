import java.util.Scanner;

public class p03469 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char c[] = S.toCharArray();
		System.out.print(2018);
		for(int i=4;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

}