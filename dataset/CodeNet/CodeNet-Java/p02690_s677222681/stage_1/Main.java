import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.nextInt();		BigInteger x = BigInteger.valueOf(newVariable_0);
		sc.close();
		int i=0;
		int j=0;
		for (i=-100; i<1000; i++) {
			for (j=-100; j<1000; j++) {
var newVariable_1 = BigInteger.valueOf(i);				BigInteger a = newVariable_1.pow(5);
var newVariable_2 = BigInteger.valueOf(j);				BigInteger b = newVariable_2.pow(5);
var newVariable_3 = a.subtract(b).equals(x);var newVariable_4 = a.subtract(b);				if (newVariable_4.equals(x)) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}

	}
}
