import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]9;n;sc.nextInt();"+n);
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}