import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(new BufferedInputStream(System.in));
		while(in.hasNext())
System.out.println("[INST]9;None;in.hasNext();"+in.hasNext());
		{
			BigInteger a = in.nextBigInteger(),b = in.nextBigInteger();
System.out.println("[INST]11;a;in.nextBigInteger();"+a);
System.out.println("[INST]11;b;in.nextBigInteger();"+b);
			System.out.println(a.divide(b));
		}
		in.close();
	}

}

