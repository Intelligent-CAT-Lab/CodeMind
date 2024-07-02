
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
System.out.println("[INST]12;X;sc.nextInt();"+X);
		int A = sc.nextInt();
System.out.println("[INST]13;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]14;B;sc.nextInt();"+B);

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
System.out.println("[INST]32;N;sc.nextInt();"+N);
		int A = sc.nextInt();
System.out.println("[INST]33;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]34;B;sc.nextInt();"+B);

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
System.out.println("[INST]48;N;sc.nextLine();"+N);

		int iN = Integer.parseInt(N);
System.out.println("[INST]50;iN;Integer.parseInt(N);"+iN);

		String[] str = N.split("");
System.out.println("[INST]52;str;N.split('');"+str);

		int I = 0;
		for (int i = 0; i < str.length; i++) {
			int I2 = Integer.parseInt(str[i]);
System.out.println("[INST]56;I2;Integer.parseInt(str[i]);"+I2);
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
System.out.println("[INST]69;N;sc.nextInt();"+N);
		int K = sc.nextInt();
System.out.println("[INST]70;K;sc.nextInt();"+K);
		int X = sc.nextInt();
System.out.println("[INST]71;X;sc.nextInt();"+X);
		int Y = sc.nextInt();
System.out.println("[INST]72;Y;sc.nextInt();"+Y);

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
System.out.println("[INST]87;W;sc.nextLine();"+W);
		String[] str = W.split("");
System.out.println("[INST]88;str;W.split('');"+str);

		String word = "abcdefghijklmnopqrstuvwxyz";
		String[] w = word.split("");
System.out.println("[INST]91;w;word.split('');"+w);

		int math = 0;

		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (w[i].equals(str[j])) {
System.out.println("[INST]97;None;w[i].equals(str[j]);"+w[i].equals(str[j]));
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
System.out.println("[INST]115;N;sc.nextInt();"+N);
		int min = 1000000;

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
System.out.println("[INST]119;a;sc.nextInt();"+a);
			int c = 0;
			while (a % 2 == 0) {
				a = a / 2;
				c++;
			}
			min = Math.min(min, c);
System.out.println("[INST]125;min;Math.min(min, c);"+min);
		}
		System.out.println(min);

	}

	private void solveF() {
//		https://beta.atcoder.jp/contests/abc081/tasks/abc081_a
		Scanner sc = new Scanner(System.in);
		char c[] = sc.nextLine().toCharArray();
System.out.println("[INST]134;c;sc.nextLine().toCharArray();"+c);
System.out.println("[INST]134;None;sc.nextLine();"+sc.nextLine());

		int num1 = Character.getNumericValue(c[0]);
System.out.println("[INST]136;num1;Character.getNumericValue(c[0]);"+num1);
		int num2 = Character.getNumericValue(c[1]);
System.out.println("[INST]137;num2;Character.getNumericValue(c[1]);"+num2);
		int num3 = Character.getNumericValue(c[2]);
System.out.println("[INST]138;num3;Character.getNumericValue(c[2]);"+num3);

		int num = num1 + num2 + num3;

		System.out.println(num);
	}


	private void solveI() {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
	}

}