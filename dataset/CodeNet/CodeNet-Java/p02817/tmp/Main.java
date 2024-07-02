import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
System.out.println("[INST]6;string;in.next();"+string);
		String tString = in.next();
System.out.println("[INST]7;tString;in.next();"+tString);
		System.out.println(tString + string);
		in.close();
	}
}