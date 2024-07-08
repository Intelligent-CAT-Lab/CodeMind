import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
var newVariable_0 = String.format("%32s", Long.toBinaryString(x & y));var newVariable_1 = Long.toBinaryString(x & y);		String str = String.format("%32s", newVariable_1).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
var newVariable_2 = String.format("%32s", Long.toBinaryString(x | y));var newVariable_3 = Long.toBinaryString(x | y);		str = String.format("%32s", newVariable_3).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
var newVariable_4 = String.format("%32s", Long.toBinaryString(x ^ y));var newVariable_5 = Long.toBinaryString(x ^ y);		str = String.format("%32s", newVariable_5).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
	}
}

