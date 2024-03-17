<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
120


```
import java.util.*;

public class p00019 {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		//calculation
		Long ans = 1L;
		for(Long N = sc.nextLong();N>1;N--){
			ans *= N;
		}
		//output
		System.out.println(ans);
	}
}
```
[/INST]
```
import math

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

n = int(input())
print(factorial(n))
```
This code uses the `math` module to calculate the factorial of a number. It first defines a function `factorial` that takes a number `n` as input and returns its factorial. The function uses a recursive approach to calculate the factorial, where it first checks if `n` is equal to 0, in which case the factorial is 1. If `n` is not equal to 0, it returns the product of `n` and the factorial of `n-1`.

The code then takes input from the user and stores it in a variable `n`. It then prints the factorial of `n` using the `print` function.

Note that this code assumes that the input is a positive integer. If the input is not a positive integer, the code will raise a `ValueError`.</s>
