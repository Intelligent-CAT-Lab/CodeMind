import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		
	    String b = "2018" + a.substring(4);
	    
	    System.out.println(b);
	}
}