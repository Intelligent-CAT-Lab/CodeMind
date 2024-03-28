Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1

Expected output:
Y$s

```
import java.util.*;
import java.io.*;

public class p03260 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if((n*k) % 2 == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}

```

### Response:
```python
import java.util.*;
import java.io.*;

public class p03260 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if((n*k) % 2 == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
```

The given java code is a simple program that takes two integers as input, n and k, and checks if n*k is odd or even. If n*k is odd, it prints "Yes" else it prints "No". 

In python, we can achieve the same functionality using the if-else statement. Here's the solution:

```python
n = int(input())
k = int(input())
if (n*k) % 2 == 1:
    print("Yes")
else:
    print("No")
```

In this solution, we first take two integers as input using the `input()` function and convert them to integers using the `int()` function. Then we check if n*k is odd or even using the modulo operator `%`. If n*k is odd, we print "Yes" else we print "No".<|endoftext|>
