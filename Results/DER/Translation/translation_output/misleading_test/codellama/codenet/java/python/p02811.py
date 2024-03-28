<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 900

Expected output:
es

```
import java.util.Scanner;
 
class p02811 {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}
```
[/INST]
```
import sys

K, X = map(int, sys.stdin.readline().split())

if X <= 500 * K:
    print("Yes")
else:
    print("No")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `if X <= 500 * K:` checks if the value of `X` is less than or equal to `500` times the value of `K`.
* `print("Yes")` or `print("No")` prints the corresponding string to the standard output.</s>
