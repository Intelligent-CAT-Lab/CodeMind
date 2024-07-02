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
System.out.println("[INST]13;n;sc.nextInt();"+n);
		int m = sc.nextInt();
System.out.println("[INST]14;m;sc.nextInt();"+m);
		
		BigInteger bin = BigInteger.valueOf(n-2);		
System.out.println("[INST]16;bin;BigInteger.valueOf(n-2);"+bin);
		BigInteger bim = BigInteger.valueOf(m-2);		
System.out.println("[INST]17;bim;BigInteger.valueOf(m-2);"+bim);
		
		BigInteger ret = bin.multiply(bim).abs();
System.out.println("[INST]19;ret;bin.multiply(bim).abs();"+ret);
System.out.println("[INST]19;None;bin.multiply(bim);"+bin.multiply(bim));
		
		
		System.out.println(ret.toString());
	}
}