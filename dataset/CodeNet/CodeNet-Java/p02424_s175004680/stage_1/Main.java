import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	//0埋め
	static String zeroLine(String a) {
		String zero = "";
var newVariable_0 = a.length();		if(newVariable_0 < 32) {

var newVariable_1 = a.length();			for(int i=0; i<32-newVariable_1; i++) {
				zero += "0";
			}
		}
		return zero + a;
	}

	//文字列の出力
	static void printStr(String a) {

var newVariable_2 = a.length();var newVariable_3 = a.length();		for(int i=newVariable_3-32; i<newVariable_3; i++) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}


	public static void main(String args[]) {

		Long num1 = scan.nextLong();
		Long num2 = scan.nextLong();

		//2進数
var newVariable_4 = Long.toBinaryString(num1 & num2);		printStr(zeroLine(newVariable_4));
		//
var newVariable_5 = Long.toBinaryString(num1 | num2);		printStr(zeroLine(newVariable_5));
		//
var newVariable_6 = Long.toBinaryString(num1 ^ num2);		printStr(zeroLine(newVariable_6));
	}
}	
