import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		BigInteger bin = BigInteger.valueOf(n-2);		
		BigInteger bim = BigInteger.valueOf(m-2);		
		
		BigInteger ret = bin.multiply(bim).abs();
		
		
		System.out.println(ret.toString());
	}
}