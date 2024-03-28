<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 17

Expected output:
83


```
import java.util.Scanner;

public class p03609 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),t=scan.nextInt();
		if(x>t) {
			System.out.println(x-t);
		}
		else if(x<=t) {
			System.out.println("0");
		}

	}

}
```
[/INST]
```
import sys

x, t = map(int, sys.stdin.readline().split())

if x > t:
    print(x - t)
else:
    print(0)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The `if` statement checks if `x` is greater than `t`, and if so, it prints the difference between `x` and `t`. If `x` is not greater than `t`, it prints `0`.

Note: The `sys` module is used to read from the standard input, and the `map()` function is used to convert the input to integers.</s>
