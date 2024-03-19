<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 14 80

Expected output:
-73

```
import java.util.Scanner;

public class p02398 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}


```
[/INST]
```
import java.util.Scanner;

public class p02398 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}
```

This is a Java program that reads three integers from the user, x, y, and z, and then prints the number of integers between x and y that are divisible by z.

Here is the equivalent Python code:
```
import sys

x, y, z = map(int, sys.stdin.readline().split())

t = 0
for i in range(x, y+1):
    if z % i == 0:
        t += 1

print(t)
```
This code uses the `map` function to convert the input from strings to integers, and the `range` function to generate the numbers between x and y. The `if` statement checks if each number is divisible by z, and if it is, it increments the variable `t`. Finally, the `print` function is used to output the value of `t`.</s>
