

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();
	    
        while(true) {
var newVariable_0 = s.length();        	if(newVariable_0==0)break;
var newVariable_1 = s.endsWith("dream");        	if(newVariable_1) {
var newVariable_2 = s.length();        		s=s.substring(0, newVariable_2-5);
var newVariable_3 = s.endsWith("dreamer");        	} else if(newVariable_3) {
var newVariable_4 = s.length();        		s=s.substring(0, newVariable_4-7);
var newVariable_5 = s.endsWith("erase");        	} else if(newVariable_5) {
var newVariable_6 = s.length();        		s=s.substring(0, newVariable_6-5);
var newVariable_7 = s.endsWith("eraser");        	} else if(newVariable_7) {
var newVariable_8 = s.length();        		s=s.substring(0, newVariable_8-6);
        	} else {
        		System.out.print("NO");
        		return;
        	}
        }
	    System.out.println("YES");
	}

	// 文字列として入力を取得
	public static String gs() {
var newVariable_9 = scanner.next();		return newVariable_9;
	}

	// intとして入力を取得
	public static int gi() {
var newVariable_10 = Integer.parseInt(scanner.next());var newVariable_11 = scanner.next();		return Integer.parseInt(newVariable_11);
	}

	// longとして入力を取得
	public static long gl() {
var newVariable_12 = Long.parseLong(scanner.next());var newVariable_13 = scanner.next();		return Long.parseLong(newVariable_13);
	}

	// doubleとして入力を取得
	public static double gd() {
var newVariable_14 = Double.parseDouble(scanner.next());var newVariable_15 = scanner.next();		return Double.parseDouble(newVariable_15);
	}
}