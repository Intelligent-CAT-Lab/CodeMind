import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
System.out.println("[INST]7;N;sc.nextLong();"+N);
		long M = sc.nextLong();
System.out.println("[INST]8;M;sc.nextLong();"+M);
		long ans = 0;


		if (N > M) {
			System.out.println(M/2);
			System.exit(0);
System.out.println("[INST]14;None;System.exit(0);"+System.exit(0));
		}

		if (N == 1 && M ==1) {
			System.out.println(0);
			System.exit(0);
System.out.println("[INST]19;None;System.exit(0);"+System.exit(0));
		}

		if (N == 2 && M ==1) {
			System.out.println(0);
			System.exit(0);
System.out.println("[INST]24;None;System.exit(0);"+System.exit(0));
		}

		if (N * 2 > M) {
			System.out.println(M/2);
			System.exit(0);
System.out.println("[INST]29;None;System.exit(0);"+System.exit(0));
		}

		ans = N + ((M - N * 2) / 4);

//		for (;;){
//			if (M - 2 >= (N + 1) * 2) {
//				M = M - 2;
//				N = N + 1;
//			} else {
//				break;
//			}
//		}



		System.out.println(ans);
		sc.close();
	}



}

