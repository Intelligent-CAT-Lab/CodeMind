import java.util.Scanner;

public class Main {
	public static void solution(int x, int y) {
		if((x+y)%2==0) {
			System.out.println((x+y)/2);
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}
		
	
	public static void main(String args []) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
System.out.println("[INST]15;x;obj.nextInt();"+x);
		int y = obj.nextInt();
System.out.println("[INST]16;y;obj.nextInt();"+y);
		solution(x,y);
	}
}