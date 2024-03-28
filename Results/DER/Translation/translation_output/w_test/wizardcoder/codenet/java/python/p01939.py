Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 9

Expected output:
50


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
import math

MOD = 1000000007

def p01939():
    first_N = int(input())
    first_M = int(input())

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
            limit = first_limit
            A = first_M+1
            B = 2*(first_M+1)*limit
            C = (first_N-1)*(limit*(first_limit+1))
            A = A + B - C
            print(A%MOD)

p01939()
```

Explanation:

- We first import the `math` module to use the `gcd()` function.
- We define a function `p01939()` that takes no arguments.
- We read the input values `first_N` and `first_M` from the user using the `input()` function.
- We check if `first_N` is equal to 1. If it is, we print the value of `(first_M+1)%MOD`.
- If `first_N` is not equal to 1, we calculate the limit `first_limit` as `(first_M+1)/(first_N-1)`.
- If `(first_M+1)%(first_N-1)` is equal to 0, we subtract 1 from `first_limit` to get the correct limit.
- We check if `first_limit` is less than or equal to 0. If it is, we print the value of `(first_M+1)%MOD`.
- If `first_limit` is greater than 0, we calculate the values of `A`, `B`, and `C` as described in the problem statement.
- We calculate the remainder of `A` when divided by `MOD` using the `remainder()` function of the `BigInteger` class.
- We print the remainder.<|endoftext|>
