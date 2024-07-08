import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
var newVariable_0 = sc.nextInt();			array[i] = newVariable_0;
		}
		Arrays.sort(array);
		System.out.println(array[0] + " " + array[2]);
	}
}

