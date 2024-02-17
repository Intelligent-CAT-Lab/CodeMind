import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = new BigInteger(sc.next()), B = new BigInteger(sc.next());
		sc.close();
		System.out.println(A.divide(B));
	}
}
