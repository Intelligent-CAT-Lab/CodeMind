import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
System.out.println("[INST]6;A;sc.nextLong();"+A);
		long B = sc.nextLong();
System.out.println("[INST]7;B;sc.nextLong();"+B);
		long C = sc.nextLong();
System.out.println("[INST]8;C;sc.nextLong();"+C);
 
		long[] array = new long[] { A, B, C };
		Arrays.sort(array);
System.out.println("[INST]11;None;Arrays.sort(array);"+Arrays.sort(array));
		
		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(array[0] * array[1]);
		}
	}
}