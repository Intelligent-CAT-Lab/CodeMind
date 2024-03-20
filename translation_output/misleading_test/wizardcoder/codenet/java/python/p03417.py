Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-36

```
import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}

```

### Response:
```python
import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}
```

The given java code is a simple program that takes two integers as input and prints the absolute difference between the product of the two integers and 2 times the sum of the two integers. The program uses the Scanner class to read input from the user.

In Python, we can achieve the same functionality using the input() function to read input from the user and the print() function to print the output. We can also use the math module to perform mathematical operations.

Here's the Python code that implements the same functionality:

```python
import math

N = int(input())
M = int(input())

print(abs((N-2) * (M-2)))
```

In this code, we first read the input values of N and M using the input() function and convert them to integers using the int() function. We then calculate the absolute difference between the product of N and M and 2 times the sum of N and M using the abs() function and the math module. Finally, we print the result using the print() function.

Note that we don't need to use the Scanner class in Python since we can directly read input from the user using the input() function.<|endoftext|>
