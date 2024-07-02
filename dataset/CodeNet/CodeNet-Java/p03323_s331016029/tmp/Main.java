import java.util.*;

public class Main {	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
System.out.println("[INST]5;b;sc.nextInt();"+b);
		if(a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}
