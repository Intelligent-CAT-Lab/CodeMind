import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String c = in.nextLine();
		if(c.matches("[aiueo]")) {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}
}