import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
System.out.println("[INST]5;x;sc.nextLong();"+x);
		long y = sc.nextLong();
System.out.println("[INST]6;y;sc.nextLong();"+y);
		String str = String.format("%32s", Long.toBinaryString(x & y)).replace(' ', '0');
System.out.println("[INST]7;str;String.format('%32s', Long.toBinaryString(x & y)).replace(' ', '0');"+str);
System.out.println("[INST]7;None;String.format('%32s', Long.toBinaryString(x & y));"+String.format("%32s", Long.toBinaryString(x & y)));
System.out.println("[INST]7;None;Long.toBinaryString(x & y);"+Long.toBinaryString(x & y));
		System.out.println(str.substring(str.length() - 32, str.length()));
		str = String.format("%32s", Long.toBinaryString(x | y)).replace(' ', '0');
System.out.println("[INST]9;str;String.format('%32s', Long.toBinaryString(x | y)).replace(' ', '0');"+str);
System.out.println("[INST]9;None;String.format('%32s', Long.toBinaryString(x | y));"+String.format("%32s", Long.toBinaryString(x | y)));
System.out.println("[INST]9;None;Long.toBinaryString(x | y);"+Long.toBinaryString(x | y));
		System.out.println(str.substring(str.length() - 32, str.length()));
		str = String.format("%32s", Long.toBinaryString(x ^ y)).replace(' ', '0');
System.out.println("[INST]11;str;String.format('%32s', Long.toBinaryString(x ^ y)).replace(' ', '0');"+str);
System.out.println("[INST]11;None;String.format('%32s', Long.toBinaryString(x ^ y));"+String.format("%32s", Long.toBinaryString(x ^ y)));
System.out.println("[INST]11;None;Long.toBinaryString(x ^ y);"+Long.toBinaryString(x ^ y));
		System.out.println(str.substring(str.length() - 32, str.length()));
	}
}

