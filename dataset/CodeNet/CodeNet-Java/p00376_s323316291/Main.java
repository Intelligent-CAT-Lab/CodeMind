import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();

		System.out.println(Math.abs(x1 - x2));

		scan.close();
	}

}
