Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
-4

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

The above code is a simple program that takes an integer input from the user and prints 1 if the input is 0, and 0 otherwise. The program uses the Scanner class to read input from the user. In Python, we can use the input() function to read input from the user. Here's the modified code:

```python
n = int(input())
if n == 0:
    print(1)
else:
    print(0)
```

In this code, we first read an integer input from the user using the input() function and store it in the variable n. We then check if n is equal to 0 and print 1 if it is, and 0 otherwise.<|endoftext|>
