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

				BigInteger B = BigInteger.valueOf(2*(first_M+1));
System.out.println("[INST]35;B;BigInteger.valueOf(2*(first_M+1));"+B);
				B = B.multiply(limit);
System.out.println("[INST]36;B;B.multiply(limit);"+B);

				BigInteger C = BigInteger.valueOf(first_N-1);
System.out.println("[INST]38;C;BigInteger.valueOf(first_N-1);"+C);
				C = C.multiply(limit);
System.out.println("[INST]39;C;C.multiply(limit);"+C);
				C = C.multiply(BigInteger.valueOf(first_limit+1));
System.out.println("[INST]40;C;C.multiply(BigInteger.valueOf(first_limit+1));"+C);
System.out.println("[INST]40;None;BigInteger.valueOf(first_limit+1);"+BigInteger.valueOf(first_limit+1));

				A = A.add(B).subtract(C);
System.out.println("[INST]42;A;A.add(B).subtract(C);"+A);
System.out.println("[INST]42;None;A.add(B);"+A.add(B));

				System.out.println(A.remainder(bigMOD));

			}

		}


	}
}