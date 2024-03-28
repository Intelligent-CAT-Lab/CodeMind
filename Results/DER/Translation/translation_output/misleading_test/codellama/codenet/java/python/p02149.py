<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:


```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```
[/INST]
```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}
```

This is the Java code provided. To translate it to Python, we can use the `input()` function to read the input from the user, and the `max()` function to find the maximum value. We can then use the `ord()` function to convert the maximum value to a character, and the `chr()` function to convert it back to a string.

Here's the Python code:
```
import sys

def main():
    inputs = sys.stdin.readline().split()
    max_value = max(map(int, inputs))
    max_index = inputs.index(str(max_value))
    print(chr(ord('A') + max_index))

if __name__ == "__main__":
    main()
```
This code reads the input from the user, finds the maximum value, and then prints the corresponding letter.

Here's an example of how the code works:
```
Input:
1000 900 850

Output:
C
```
In this example, the input is "1000 900 850", and the maximum value is 1000, which corresponds to the letter "C".</s>
