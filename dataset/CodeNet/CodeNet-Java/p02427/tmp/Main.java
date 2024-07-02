import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);

		for(int i = 0; i < Math.pow(2, n); i++) {
System.out.println("[INST]8;None;Math.pow(2, n);"+Math.pow(2, n));
			int temp = i;
			System.out.print(i + ":");
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) System.out.print(" " + j);
				temp /= 2;
			}
			System.out.println();
		}
	}
}
