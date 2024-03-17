<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atcoder


```
import java.util.Scanner;

public class p02817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String tString = in.next();
		System.out.println(tString + string);
		in.close();
	}
}
```
[/INST]
```
import sys

string = sys.stdin.readline().strip()
tString = sys.stdin.readline().strip()
print(tString + string)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `strip()` removes any leading or trailing whitespace from the line.
* `print()` prints the concatenated string to the standard output.

Note: The `strip()` method is used to remove any leading or trailing whitespace from the input strings, as the Java code in the question does not do this.</s>
