
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveG();
	}

	private void solveG() {
//		https://beta.atcoder.jp/contests/abc065/tasks/abc065_a
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		if(A>=B){
			System.out.println("delicious");
		}else if(X + A < B){
			System.out.println("dangerous");
		}else{
			System.out.println("safe");
		}
	}

	private void solveH() {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int NA = N * A;

		if (NA > B) {
			System.out.println(B);
		} else {
			System.out.println(NA);
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);

		String N = sc.nextLine();

		int iN = Integer.parseInt(N);

		String[] str = N.split("");

		int I = 0;
		for (int i = 0; i < str.length; i++) {
			int I2 = Integer.parseInt(str[i]);
			I += I2;
		}
		if (iN % I == 0) {
			System.out.println("Yes");
		} else if (iN % I != 0) {
			System.out.println("No");
		}

	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int NX = N * X;
		int NKY = (N - K) * Y;

		if (N <= K) {
			System.out.println(NX);
		} else {
			System.out.println(K * X + (N - K) * Y);
		}
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);

		String W = sc.nextLine();
		String[] str = W.split("");

		String word = "abcdefghijklmnopqrstuvwxyz";
		String[] w = word.split("");

		int math = 0;

		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (w[i].equals(str[j])) {
					math++;
				}
			}
			if (math % 2 != 0) {
				break;
			}
		}
		if (math % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 1000000;

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int c = 0;
			while (a % 2 == 0) {
				a = a / 2;
				c++;
			}
			min = Math.min(min, c);
		}
		System.out.println(min);

	}

	private void solveF() {
//		https://beta.atcoder.jp/contests/abc081/tasks/abc081_a
		Scanner sc = new Scanner(System.in);
		char c[] = sc.nextLine().toCharArray();

		int num1 = Character.getNumericValue(c[0]);
		int num2 = Character.getNumericValue(c[1]);
		int num3 = Character.getNumericValue(c[2]);

		int num = num1 + num2 + num3;

		System.out.println(num);
	}


	private void solveI() {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
	}

}