import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String []args)
	{
		Scanner in =new Scanner(new BufferedInputStream(System.in));
		while(in.hasNext())
System.out.println("[INST]8;None;in.hasNext();"+in.hasNext());
		{
			BigInteger a = in.nextBigInteger(),b = in.nextBigInteger();
System.out.println("[INST]10;a;in.nextBigInteger();"+a);
System.out.println("[INST]10;b;in.nextBigInteger();"+b);
			System.out.println(a.remainder(b));
		}
		in.close();
	}
}

