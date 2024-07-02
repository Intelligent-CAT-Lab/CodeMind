import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
System.out.println("[INST]8;n;sc.nextLong();"+n);
			long a = sc.nextLong();
System.out.println("[INST]9;a;sc.nextLong();"+a);
			long b = sc.nextLong();
System.out.println("[INST]10;b;sc.nextLong();"+b);
			
			
			if(a>b||(n==1&&a!=b)) {
				System.out.println(0);
				return;
			}
			if(a==b) {
				System.out.println(1);
				return;
			}
			
			System.out.println((n-2)*(b-a)+1);
			
	    }
				
	}
