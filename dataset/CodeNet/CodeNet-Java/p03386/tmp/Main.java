

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
System.out.println("[INST]10;a;scanner.nextInt();"+a);
		int b = scanner.nextInt();
System.out.println("[INST]11;b;scanner.nextInt();"+b);
		int k = scanner.nextInt();
System.out.println("[INST]12;k;scanner.nextInt();"+k);
		Set<Integer> set = new TreeSet<>();
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
System.out.println("[INST]20;None;set.add(i);"+set.add(i));
		}
		cnt = 0;
		for (int i = b; i >= a; i--) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
System.out.println("[INST]28;None;set.add(i);"+set.add(i));
		}
		
		for (Integer ans : set) {
			System.out.println(ans);
		}
		scanner.close();

	}

}
