import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]4;n;sc.nextInt();"+n);
		int m = sc.nextInt();
System.out.println("[INST]5;m;sc.nextInt();"+m);
		
		int max = m/n;
		for (int i = max; i > 0; i--) {
			if (m%i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}