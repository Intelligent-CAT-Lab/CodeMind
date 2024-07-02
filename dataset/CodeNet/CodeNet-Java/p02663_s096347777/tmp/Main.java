import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H1= sc.nextInt();
System.out.println("[INST]7;H1;sc.nextInt();"+H1);
		int M1= sc.nextInt();
System.out.println("[INST]8;M1;sc.nextInt();"+M1);
		int H2 = sc.nextInt();
System.out.println("[INST]9;H2;sc.nextInt();"+H2);
		int M2= sc.nextInt();
System.out.println("[INST]10;M2;sc.nextInt();"+M2);
		int K = sc.nextInt();
System.out.println("[INST]11;K;sc.nextInt();"+K);
		int start = H1*60+M1;
		int end = H2*60+M2;
		System.out.println(end-start-K);
	}
}