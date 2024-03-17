<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


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

This is a Java program that reads three integers from the user and prints the largest integer.

Here is the equivalent Python code:
```
import sys

def main():
    max = 0
    idx = 0
    for i in range(3):
        x = int(sys.stdin.readline())
        if max < x:
            max = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()
```
This code uses the `sys` module to read input from the user and the `chr` and `ord` functions to convert between characters and integers.

The `main` function reads three integers from the user using the `readline` method of the `stdin` object, and then finds the largest integer using a loop. The index of the largest integer is stored in the `idx` variable, and the corresponding character is printed using the `chr` function.

The `if __name__ == "__main__":` block is used to run the `main` function when the program is executed as a script.</s>
