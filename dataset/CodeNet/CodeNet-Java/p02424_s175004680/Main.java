import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	//0埋め
	static String zeroLine(String a) {
		String zero = "";
		if(a.length() < 32) {

			for(int i=0; i<32-a.length(); i++) {
				zero += "0";
			}
		}
		return zero + a;
	}

	//文字列の出力
	static void printStr(String a) {

		for(int i=a.length()-32; i<a.length(); i++) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}


	public static void main(String args[]) {

		Long num1 = scan.nextLong();
		Long num2 = scan.nextLong();

		//2進数
		printStr(zeroLine(Long.toBinaryString(num1 & num2)));
		//
		printStr(zeroLine(Long.toBinaryString(num1 | num2)));
		//
		printStr(zeroLine(Long.toBinaryString(num1 ^ num2)));
	}
}	
