<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2


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
n = int(input("Enter the value of n: "))
k = int(input("Enter the value of k: "))
print(n - k + 1)
```
This code will prompt the user to enter the values of `n` and `k`, and then print the result of `n - k + 1` to the console.

Note that in Python, we don't need to create a `Scanner` object to read input from the user, we can simply use the `input()` function to read input from the user.</s>
