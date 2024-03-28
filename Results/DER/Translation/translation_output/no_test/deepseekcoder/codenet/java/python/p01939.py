<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
MOD = 1000000007

first_N, first_M = map(int, input().split())

if first_N == 1:
    print((first_M+1)%MOD)
else:
    if (first_M+1)%(first_N-1) == 0:
        first_limit = (first_M+1)//(first_N-1)-1
    else:
        first_limit = (first_M+1)//(first_N-1)

    if first_limit <= 0:
        print((first_M+1)%MOD)
    else:
        A = first_M+1
        B = 2*(first_M+1)*first_limit
        C = (first_N-1)*first_limit*(first_limit+1)

        print((A+B-C)%MOD)
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the limit and then prints the result of a calculation based on the limit. If the limit is less than or equal to zero, it prints the result of the calculation without the modulo operation.
<|EOT|>
