
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
System.out.println("[INST]10;a;scan.nextInt();"+a);
		

		if(a>=1200)
			System.out.println("ARC");
		else
			System.out.println("ABC");
	}
}