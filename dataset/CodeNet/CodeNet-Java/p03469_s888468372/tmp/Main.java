import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
System.out.println("[INST]5;a;stdIn.next();"+a);
		
	    String b = "2018" + a.substring(4);
System.out.println("[INST]7;None;a.substring(4);"+a.substring(4));
	    
	    System.out.println(b);
	}
}