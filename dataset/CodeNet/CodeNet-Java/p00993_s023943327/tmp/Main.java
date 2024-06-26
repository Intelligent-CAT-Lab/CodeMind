import java.math.BigInteger;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	BigInteger fact(int n) {
		BigInteger bi = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			bi = bi.multiply(new BigInteger(String.valueOf(i)));
System.out.println("[INST]12;bi;bi.multiply(new BigInteger(String.valueOf(i)));"+bi);
System.out.println("[INST]12;None;String.valueOf(i);"+String.valueOf(i));
		}
		return bi;
	}
	
	void run() {
		int n = sc.nextInt();
System.out.println("[INST]18;n;sc.nextInt();"+n);
		BigInteger bi = fact(n+1);
		out.println(bi.add(new BigInteger("2")));
		for (int i = 2; i <= n+1; i++)
			out.println(i);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}