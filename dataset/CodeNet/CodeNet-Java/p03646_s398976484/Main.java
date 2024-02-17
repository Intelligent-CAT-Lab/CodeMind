import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		long x = K % 50, y = K /50;
		long[] a = new long[50];
		for(int i = 0; i < 50; i++) {
			a[i] = i + y;
			if(i >= 50 - x)
				a[i]++;
		}
		System.out.println(50);
		for(int i = 0; i < 50; i++)
			System.out.print(a[i] + " ");
	}

}