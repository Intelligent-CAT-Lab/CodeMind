<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
MOD = 1000000007

def main():
	first_N = int(raw_input())
	first_M = int(raw_input())

	if first_N == 1:
		print (first_M+1)%MOD
	else:
		if (first_M+1)%(first_N-1) == 0:
			first_limit = (first_M+1)/(first_N-1)-1
		else:
			first_limit = (first_M+1)/(first_N-1)

		if first_limit <= 0:
			print (first_M+1)%MOD
		else:
			A = first_M+1
			B = 2*(first_M+1)
			C = first_N-1
			C = C*(first_limit+1)
			A = A+B-C
			print A%MOD

if __name__ == '__main__':
	main()
```
<|endoftext|>
