import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BigInteger x = BigInteger.valueOf(sc.nextInt());
		sc.close();
		int i=0;
		int j=0;
		for (i=-100; i<1000; i++) {
			for (j=-100; j<1000; j++) {
				BigInteger a = BigInteger.valueOf(i).pow(5);
				BigInteger b = BigInteger.valueOf(j).pow(5);
				if (a.subtract(b).equals(x)) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}

	}
}
