import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]5;n;sc.nextInt();"+n);
		boolean[] arr = new boolean[n + 3];
		arr[0] = true;
		arr[1] = true;
		int count = 0;
		for (int i = 2; i < arr.length; i++) {
		    if (!arr[i]) {
		        for (int j = 2; j * i < arr.length; j++) {
		            arr[i * j]  = true;
		        }
		        if (!arr[i] && !arr[i - 2]) {
		            count++;
		        }
		    }
		}
		System.out.println(count * 2);
	}
}

