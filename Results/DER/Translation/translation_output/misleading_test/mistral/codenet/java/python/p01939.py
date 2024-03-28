<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 9

Expected output:
-32

```
import java.math.BigInteger;
import java.util.Scanner;

public class p01939 {

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

				BigInteger B = BigInteger.valueOf(2*(first_M+1));
				B = B.multiply(limit);

				BigInteger C = BigInteger.valueOf(first_N-1);
				C = C.multiply(limit);
				C = C.multiply(BigInteger.valueOf(first_limit+1));

				A = A.add(B).subtract(C);

				System.out.println(A.remainder(bigMOD));

			}

		}


	}
}
```
[/INST]
```python
import math

MOD = 1000000007

def p01939():
    first_N = int(input())
    first_M = int(input())

    first_limit = (first_M + 1) // (first_N - 1)

    if first_limit <= 0:
        print((first_M + 1) % MOD)
    else:
        bigMOD = math.bigmod(MOD, 10**18)
        limit = math.bigmod(first_limit, 10**18)
        A = math.bigmod(first_M + 1, 10**18)
        B = math.bigmod(2 * (first_M + 1), 10**18)
        B = B * limit
        C = math.bigmod(first_N - 1, 10**18)
        C = C * limit
        C = C * math.bigmod(first_limit + 1, 10**18)
        A = A + B - C
        print(A % bigMOD)

if __name__ == "__main__":
    p01939()
```</s>
