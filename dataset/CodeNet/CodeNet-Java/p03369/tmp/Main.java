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
		return scanner.next();
System.out.println("[INST]22;None;scanner.next();"+scanner.next());
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
System.out.println("[INST]27;None;Integer.parseInt(scanner.next());"+Integer.parseInt(scanner.next()));
System.out.println("[INST]27;None;scanner.next();"+scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
System.out.println("[INST]32;None;Long.parseLong(scanner.next());"+Long.parseLong(scanner.next()));
System.out.println("[INST]32;None;scanner.next();"+scanner.next());
	}
	
	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
System.out.println("[INST]37;None;Double.parseDouble(scanner.next());"+Double.parseDouble(scanner.next()));
System.out.println("[INST]37;None;scanner.next();"+scanner.next());
	}
}