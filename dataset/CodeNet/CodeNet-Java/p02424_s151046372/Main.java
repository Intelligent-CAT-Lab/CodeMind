import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		String str = String.format("%32s", Long.toBinaryString(x & y)).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
		str = String.format("%32s", Long.toBinaryString(x | y)).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
		str = String.format("%32s", Long.toBinaryString(x ^ y)).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
	}
}

