
import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		BigInteger a,b;
		Scanner cin=new Scanner(System.in);
		a=cin.nextBigInteger();
System.out.println("[INST]8;a;cin.nextBigInteger();"+a);
		b=cin.nextBigInteger();
System.out.println("[INST]9;b;cin.nextBigInteger();"+b);
		System.out.println(a.remainder(b));
	}
}

