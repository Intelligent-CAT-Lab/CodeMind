import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int total = 0;
		for (int i = 0; i < 4; i++) {
		    arr[i] = sc.nextInt();
System.out.println("[INST]8;None;sc.nextInt();"+sc.nextInt());
		    total += arr[i];
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < 4; i++) {
		    min = Math.min(min, Math.abs(total - (arr[0] + arr[i]) * 2));
System.out.println("[INST]13;min;Math.min(min, Math.abs(total - (arr[0] + arr[i]) * 2));"+min);
System.out.println("[INST]13;None;Math.abs(total - (arr[0] + arr[i]) * 2);"+Math.abs(total - (arr[0] + arr[i]) * 2));
		}
		System.out.println(min);
	}
}

