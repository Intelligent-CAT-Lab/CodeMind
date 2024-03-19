<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
-9

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

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings, where each string is a number.
* `map(int, ...)` applies the `int()` function to each string in the list, which converts it to an integer.
* `n_comb` and `m_comb` are calculated using the formula for the number of combinations of `n` and `m` objects, respectively.
* `print()` prints the result to the standard output.</s>
