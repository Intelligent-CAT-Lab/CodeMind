<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
":Jn

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

a = [int(x) for x in input().split()]

if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```
Explanation:

* `input()` is used to read a line of input from the user.
* `split()` is used to split the input into a list of strings, where each string is a number.
* `int()` is used to convert each string to an integer.
* `a[0] == 1 and a[1] == 1` checks if the first two elements of the list are both 1.
* `a[2] == 1` checks if the third element of the list is 1.
* `print("Open")` prints "Open" if the first two elements are both 1 or if the third element is 1.
* `print("Close")` prints "Close" otherwise.</s>
