Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
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

The above code is a Java program that takes three integers as input from the user and counts the number of integers between x and y that are divisible by z. The output is then printed to the console.

In Python, we can achieve the same functionality using the same logic. Here's the equivalent Python code:

```python
import java.util.Scanner;

x = int(input())
y = int(input())
z = int(input())

t = 0
for i in range(x, y+1):
    if z % i == 0:
        t += 1

print(t)
```

In this code, we first read the input values from the user using the `input()` function and convert them to integers using the `int()` function. We then initialize a variable `t` to 0 and use a `for` loop to iterate over the range of integers between `x` and `y`. For each integer `i` in this range, we check if it is divisible by `z` using the modulo operator `%`. If it is, we increment the value of `t` by 1. Finally, we print the value of `t` to the console using the `print()` function.<|endoftext|>
