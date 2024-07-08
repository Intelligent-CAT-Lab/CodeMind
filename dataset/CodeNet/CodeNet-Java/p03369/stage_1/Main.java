import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();

        System.out.println((s.length() - s.replace("o","").length())*100+700);
//        if (a<=x && a+b>=x) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
//        }


	}

	// 文字列として入力を取得
	public static String gs() {
var newVariable_0 = scanner.next();		return newVariable_0;
	}

	// intとして入力を取得
	public static int gi() {
var newVariable_1 = Integer.parseInt(scanner.next());var newVariable_2 = scanner.next();		return Integer.parseInt(newVariable_2);
	}

	// longとして入力を取得
	public static long gl() {
var newVariable_3 = Long.parseLong(scanner.next());var newVariable_4 = scanner.next();		return Long.parseLong(newVariable_4);
	}
	
	// doubleとして入力を取得
	public static double gd() {
var newVariable_5 = Double.parseDouble(scanner.next());var newVariable_6 = scanner.next();		return Double.parseDouble(newVariable_6);
	}
}