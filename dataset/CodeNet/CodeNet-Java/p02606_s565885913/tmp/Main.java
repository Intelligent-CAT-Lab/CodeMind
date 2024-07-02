import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
System.out.println("[INST]5;L;sc.nextInt();"+L);
		int R = sc.nextInt();
System.out.println("[INST]6;R;sc.nextInt();"+R);
		int d = sc.nextInt();
System.out.println("[INST]7;d;sc.nextInt();"+d);
		int cnt = 0;
		
		for(int i = L; i <= R; i++) {
			if(i % d == 0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}