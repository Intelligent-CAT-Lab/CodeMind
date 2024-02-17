import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		int MOD = 1000000007;

		Scanner sc = new Scanner(System.in);
		Long first_N = sc.nextLong();
		Long first_M = sc.nextLong();

		Long first_limit;

		if(first_N == 1){
			System.out.println((first_M+1)%MOD);
		}else{

			if((first_M+1)%(first_N-1) == 0){
				first_limit = (first_M+1)/(first_N-1)-1;
			}else{
				first_limit = (first_M+1)/(first_N-1);
			}

			if(first_limit <= 0){
				System.out.println((first_M+1)%MOD);
			}else{

				BigInteger bigMOD = BigInteger.valueOf(MOD);

				BigInteger limit = BigInteger.valueOf(first_limit);

				BigInteger A = BigInteger.valueOf(first_M+1);

				BigInteger B = BigInteger.valueOf(2*(first_M+1)).multiply(limit);

				BigInteger C = BigInteger.valueOf(first_N-1).multiply(limit);
				C = C.multiply(BigInteger.valueOf(first_limit+1));

				System.out.println((A.add(B).subtract(C)).remainder(bigMOD));
			}
		}
	}
}