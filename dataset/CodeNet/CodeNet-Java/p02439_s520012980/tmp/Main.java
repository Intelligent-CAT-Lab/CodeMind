import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
System.out.println("[INST]10;None;sc.nextInt();"+sc.nextInt());
		}
		Arrays.sort(array);
System.out.println("[INST]12;None;Arrays.sort(array);"+Arrays.sort(array));
		System.out.println(array[0] + " " + array[2]);
	}
}

