import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		System.out.println(k == 1 ? 0 : n - k);
	}

	public int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
var newVariable_0 = sc.nextInt();			array[i] = newVariable_0;
		}
		return array;
	}

	public long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
var newVariable_1 = sc.nextLong();			array[i] = newVariable_1;
		}
		return array;
	}

	public double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
var newVariable_2 = sc.nextDouble();			array[i] = newVariable_2;
		}
		return array;
	}
}
