import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String c = in.nextLine();
var newVariable_0 = c.matches("[aiueo]");		if(newVariable_0) {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}
}