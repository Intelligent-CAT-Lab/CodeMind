Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
0


```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

### Response:
```python
import java.util.Scanner;

public class p02552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
```

The above code is a simple program that takes an integer input from the user and prints either 0 or 1 depending on whether the input is 0 or not. The program uses the Scanner class to read input from the user.

In Python, we can achieve the same functionality using the input() function to read input from the user and the print() function to print output to the console. Here's the equivalent Python code:

```python
n = int(input())
if n == 0:
    print(1)
else:
    print(0)
```

In this code, we first read an integer input from the user using the input() function and store it in the variable n. We then use an if-else statement to check whether n is equal to 0 or not. If it is, we print 1, otherwise we print 0.<|endoftext|>
