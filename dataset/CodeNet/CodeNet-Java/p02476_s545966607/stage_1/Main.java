
import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		BigInteger a,b;
		Scanner cin=new Scanner(System.in);
		a=cin.nextBigInteger();
		b=cin.nextBigInteger();
		System.out.println(a.remainder(b));
	}
}

