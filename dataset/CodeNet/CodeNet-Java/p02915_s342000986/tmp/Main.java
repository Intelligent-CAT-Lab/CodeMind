import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
		sc.close();
double a=Math.pow((double)n,3);
System.out.println("[INST]9;a;Math.pow((double)n,3);"+a);
			System.out.println((int)a);

	}
}