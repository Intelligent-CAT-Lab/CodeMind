import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]5;n;sc.nextInt();"+n);
		int k = sc.nextInt();
System.out.println("[INST]6;k;sc.nextInt();"+k);
		sc.close();
		System.out.println(k == 1 ? 0 : n - k);
	}

	public int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
System.out.println("[INST]14;None;sc.nextInt();"+sc.nextInt());
		}
		return array;
	}

	public long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
System.out.println("[INST]22;None;sc.nextLong();"+sc.nextLong());
		}
		return array;
	}

	public double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
System.out.println("[INST]30;None;sc.nextDouble();"+sc.nextDouble());
		}
		return array;
	}
}
