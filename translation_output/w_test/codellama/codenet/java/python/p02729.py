<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
1


```
import java.util.Scanner;

public class p02729 {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}
```
[/INST]
```
import sys

n, m = map(int, sys.stdin.readline().split())

n_comb = n * (n-1) // 2
m_comb = m * (m-1) // 2

print(n_comb + m_comb)
```
Explanation:

* `map(int, sys.stdin.readline().split())` is used to read the input from the standard input and convert it to a list of integers.
* `n_comb = n * (n-1) // 2` is used to calculate the number of combinations for the first set of numbers.
* `m_comb = m * (m-1) // 2` is used to calculate the number of combinations for the second set of numbers.
* `print(n_comb + m_comb)` is used to print the sum of the number of combinations for both sets of numbers.</s>
