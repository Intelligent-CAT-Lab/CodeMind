import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		int MOD = 1000000007;

		Scanner sc = new Scanner(System.in);
		Long first_N = sc.nextLong();
System.out.println("[INST]10;first_N;sc.nextLong();"+first_N);
		Long first_M = sc.nextLong();
System.out.println("[INST]11;first_M;sc.nextLong();"+first_M);

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
System.out.println("[INST]29;bigMOD;BigInteger.valueOf(MOD);"+bigMOD);

				BigInteger limit = BigInteger.valueOf(first_limit);
System.out.println("[INST]31;limit;BigInteger.valueOf(first_limit);"+limit);

				BigInteger A = BigInteger.valueOf(first_M+1);
System.out.println("[INST]33;A;BigInteger.valueOf(first_M+1);"+A);

				BigInteger B = BigInteger.valueOf(2*(first_M+1)).multiply(limit);
System.out.println("[INST]35;B;BigInteger.valueOf(2*(first_M+1)).multiply(limit);"+B);
System.out.println("[INST]35;None;BigInteger.valueOf(2*(first_M+1));"+BigInteger.valueOf(2*(first_M+1)));

				BigInteger C = BigInteger.valueOf(first_N-1).multiply(limit);
System.out.println("[INST]37;C;BigInteger.valueOf(first_N-1).multiply(limit);"+C);
System.out.println("[INST]37;None;BigInteger.valueOf(first_N-1);"+BigInteger.valueOf(first_N-1));
				C = C.multiply(BigInteger.valueOf(first_limit+1));
System.out.println("[INST]38;C;C.multiply(BigInteger.valueOf(first_limit+1));"+C);
System.out.println("[INST]38;None;BigInteger.valueOf(first_limit+1);"+BigInteger.valueOf(first_limit+1));

				System.out.println((A.add(B).subtract(C)).remainder(bigMOD));
			}
		}
	}
}