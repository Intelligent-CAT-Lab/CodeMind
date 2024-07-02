

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();
	    
        while(true) {
        	if(s.length()==0)break;
System.out.println("[INST]13;None;s.length();"+s.length());
        	if(s.endsWith("dream")) {
System.out.println("[INST]14;None;s.endsWith('dream');"+s.endsWith("dream"));
        		s=s.substring(0, s.length()-5);
System.out.println("[INST]15;s;s.substring(0, s.length()-5);"+s);
System.out.println("[INST]15;None;s.length();"+s.length());
        	} else if(s.endsWith("dreamer")) {
System.out.println("[INST]16;None;s.endsWith('dreamer');"+s.endsWith("dreamer"));
        		s=s.substring(0, s.length()-7);
System.out.println("[INST]17;s;s.substring(0, s.length()-7);"+s);
System.out.println("[INST]17;None;s.length();"+s.length());
        	} else if(s.endsWith("erase")) {
System.out.println("[INST]18;None;s.endsWith('erase');"+s.endsWith("erase"));
        		s=s.substring(0, s.length()-5);
System.out.println("[INST]19;s;s.substring(0, s.length()-5);"+s);
System.out.println("[INST]19;None;s.length();"+s.length());
        	} else if(s.endsWith("eraser")) {
System.out.println("[INST]20;None;s.endsWith('eraser');"+s.endsWith("eraser"));
        		s=s.substring(0, s.length()-6);
System.out.println("[INST]21;s;s.substring(0, s.length()-6);"+s);
System.out.println("[INST]21;None;s.length();"+s.length());
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
System.out.println("[INST]32;None;scanner.next();"+scanner.next());
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
System.out.println("[INST]37;None;Integer.parseInt(scanner.next());"+Integer.parseInt(scanner.next()));
System.out.println("[INST]37;None;scanner.next();"+scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
System.out.println("[INST]42;None;Long.parseLong(scanner.next());"+Long.parseLong(scanner.next()));
System.out.println("[INST]42;None;scanner.next();"+scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
System.out.println("[INST]47;None;Double.parseDouble(scanner.next());"+Double.parseDouble(scanner.next()));
System.out.println("[INST]47;None;scanner.next();"+scanner.next());
	}
}