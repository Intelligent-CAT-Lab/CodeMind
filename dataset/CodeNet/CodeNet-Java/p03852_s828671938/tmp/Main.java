import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String c = in.nextLine();
System.out.println("[INST]6;c;in.nextLine();"+c);
		if(c.matches("[aiueo]")) {
System.out.println("[INST]7;None;c.matches('[aiueo]');"+c.matches("[aiueo]"));
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}
}