import static java.lang.System.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int x, y;
		int A[] = { 1, 3, 5, 7, 8, 10, 12 };
		int B[] = { 4, 6, 9, 11 };
		String Xans, Yans;
		Xans = "";
		Yans = "";
		x = sc.nextInt();
		y = sc.nextInt();

		for (int i = 0; i < A.length; i++) {
			if (x == A[i])
				Xans = "A";
			if (y == A[i])
				Yans = "A";
		}
		for (int i = 0; i < B.length; i++) {
			if (x == B[i])
				Xans = "B";
			if (y == B[i])
				Yans = "B";
		}
		if (x == 2)
			Xans = "C";
		if (y == 2)
			Yans = "C";

		if (Xans.equals(Yans))
			out.println("Yes");
		else {
			out.println("No");
		}
	}

}
