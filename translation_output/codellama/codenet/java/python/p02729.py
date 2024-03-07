<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

n, m = map(int, input().split())

n_comb = n * (n-1) // 2
m_comb = m * (m-1) // 2

print(n_comb + m_comb)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `//` operator is used for integer division. The `input` function is used to read a line of input from the user, and the `split` method is used to split the input into a list of strings. The `int` function is used to convert the strings to integers.</s>
