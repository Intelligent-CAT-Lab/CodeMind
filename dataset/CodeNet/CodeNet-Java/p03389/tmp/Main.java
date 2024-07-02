import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
		int C = sc.nextInt();
System.out.println("[INST]7;C;sc.nextInt();"+C);
		int M = Math.max(A, Math.max(B, C));
System.out.println("[INST]8;M;Math.max(A, Math.max(B, C));"+M);
System.out.println("[INST]8;None;Math.max(B, C);"+Math.max(B, C));

		if((A+B+C)%2 == M%2) {
			System.out.println((3*M-(A+B+C))/2);
		}else {
			System.out.println(((3*M+3)-(A+B+C))/2);
		}

	}

}
