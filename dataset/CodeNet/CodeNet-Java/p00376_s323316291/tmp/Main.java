import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
System.out.println("[INST]7;x1;scan.nextInt();"+x1);
		int x2 = scan.nextInt();
System.out.println("[INST]8;x2;scan.nextInt();"+x2);

		System.out.println(Math.abs(x1 - x2));

		scan.close();
	}

}
