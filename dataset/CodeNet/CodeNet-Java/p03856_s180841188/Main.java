

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();
	    
        while(true) {
        	if(s.length()==0)break;
        	if(s.endsWith("dream")) {
        		s=s.substring(0, s.length()-5);
        	} else if(s.endsWith("dreamer")) {
        		s=s.substring(0, s.length()-7);
        	} else if(s.endsWith("erase")) {
        		s=s.substring(0, s.length()-5);
        	} else if(s.endsWith("eraser")) {
        		s=s.substring(0, s.length()-6);
        	} else {
        		System.out.print("NO");
        		return;
        	}
        }
	    System.out.println("YES");
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}