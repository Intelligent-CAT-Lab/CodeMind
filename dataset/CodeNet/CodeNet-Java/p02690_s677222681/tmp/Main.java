import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BigInteger x = BigInteger.valueOf(sc.nextInt());
System.out.println("[INST]8;x;BigInteger.valueOf(sc.nextInt());"+x);
System.out.println("[INST]8;None;sc.nextInt();"+sc.nextInt());
		sc.close();
		int i=0;
		int j=0;
		for (i=-100; i<1000; i++) {
			for (j=-100; j<1000; j++) {
				BigInteger a = BigInteger.valueOf(i).pow(5);
System.out.println("[INST]14;a;BigInteger.valueOf(i).pow(5);"+a);
System.out.println("[INST]14;None;BigInteger.valueOf(i);"+BigInteger.valueOf(i));
				BigInteger b = BigInteger.valueOf(j).pow(5);
System.out.println("[INST]15;b;BigInteger.valueOf(j).pow(5);"+b);
System.out.println("[INST]15;None;BigInteger.valueOf(j);"+BigInteger.valueOf(j));
				if (a.subtract(b).equals(x)) {
System.out.println("[INST]16;None;a.subtract(b).equals(x);"+a.subtract(b).equals(x));
System.out.println("[INST]16;None;a.subtract(b);"+a.subtract(b));
					System.out.println(i + " " + j);
					return;
				}
			}
		}

	}
}
