import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
			int m = sc.nextInt();
System.out.println("[INST]8;m;sc.nextInt();"+m);

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}