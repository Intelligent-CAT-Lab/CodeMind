import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextInt();
System.out.println("[INST]6;l;sc.nextInt();"+l);
		long r = sc.nextInt();
System.out.println("[INST]7;r;sc.nextInt();"+r);
		long min = 2018;
		for (long i = l; i < r; i++) {
			if (min == 0)
				break;
			for (long j = i + 1; j <= r; j++) {
				if (i * j % 2019 < min)
					min = i * j % 2019;
				if (min == 0)
					break;
			}
		}

		System.out.println(min);
	}
}
