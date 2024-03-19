<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-77

```
import java.util.*;
public class p03047 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// æ´æ°ã®å¥å
		int n = sc.nextInt();
		int k= sc.nextInt();
		
		System.out.println(n-k+1);

	}
}
```
[/INST]
```
import java.util.Scanner;

public class p03047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(n - k + 1);
    }
}
```

In Python, we can use the `input()` function to read input from the user, and the `print()` function to print output to the console.

Here's the Python code for the same program:
```
n = int(input("Enter a number: "))
k = int(input("Enter another number: "))
print(n - k + 1)
```
This code will prompt the user to enter two numbers, and then print the difference between the two numbers plus one.

For example, if the user enters `3` and `2`, the program will print `1`.</s>
