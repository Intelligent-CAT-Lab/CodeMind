import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
System.out.println("[INST]8;x;sc.nextInt();"+x);
			
			while(!prime(x)) {
				x++;
			}
			System.out.println(x);
			
			
		}
		
		static boolean prime(int x) {
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}