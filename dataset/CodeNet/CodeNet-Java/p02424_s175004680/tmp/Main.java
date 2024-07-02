import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	//0埋め
	static String zeroLine(String a) {
		String zero = "";
		if(a.length() < 32) {
System.out.println("[INST]9;None;a.length();"+a.length());

			for(int i=0; i<32-a.length(); i++) {
System.out.println("[INST]11;None;a.length();"+a.length());
				zero += "0";
			}
		}
		return zero + a;
	}

	//文字列の出力
	static void printStr(String a) {

		for(int i=a.length()-32; i<a.length(); i++) {
System.out.println("[INST]21;None;a.length();"+a.length());
System.out.println("[INST]21;None;a.length();"+a.length());
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}


	public static void main(String args[]) {

		Long num1 = scan.nextLong();
System.out.println("[INST]30;num1;scan.nextLong();"+num1);
		Long num2 = scan.nextLong();
System.out.println("[INST]31;num2;scan.nextLong();"+num2);

		//2進数
		printStr(zeroLine(Long.toBinaryString(num1 & num2)));
System.out.println("[INST]34;None;Long.toBinaryString(num1 & num2);"+Long.toBinaryString(num1 & num2));
		//
		printStr(zeroLine(Long.toBinaryString(num1 | num2)));
System.out.println("[INST]36;None;Long.toBinaryString(num1 | num2);"+Long.toBinaryString(num1 | num2));
		//
		printStr(zeroLine(Long.toBinaryString(num1 ^ num2)));
System.out.println("[INST]38;None;Long.toBinaryString(num1 ^ num2);"+Long.toBinaryString(num1 ^ num2));
	}
}	
