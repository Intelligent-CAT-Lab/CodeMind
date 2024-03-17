<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Open


```
import java.util.Scanner;
public class p00252 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		if(a[0] == 1 && a[1] == 1) {
			System.out.println("Open");
		}
		else if(a[2] == 1) {
			System.out.println("Open");
		}
		else {
			System.out.println("Close");
		}
		
	}

}
```
[/INST]
```
import sys

a = [int(x) for x in sys.stdin.readline().split()]

if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `[int(x) for x in ...]` is a list comprehension that converts each substring to an integer.
* The rest of the code is the same as the Java code, with the exception of the `print()` function, which is used in Python instead of `System.out.println()`.</s>
