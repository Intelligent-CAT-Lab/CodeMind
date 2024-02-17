import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f ? "Yes" : "No";
		System.out.println(ret);
	}
}
