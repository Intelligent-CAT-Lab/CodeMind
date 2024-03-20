Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
733035

Expected output:
733035
244345
48869
1
-36

```
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_58_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " ");
        int m = n;
        for (int i = n - 1; i > 0; i--) {
            if (m % i == 0) {
                System.out.println(i + " ");
                m = i;
            }
        }
    }
}
```

### Response:
```python
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_58_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " ");
        int m = n;
        for (int i = n - 1; i > 0; i--) {
            if (m % i == 0) {
                System.out.println(i + " ");
                m = i;
            }
        }
    }
}
```

The given Java code is a simple program that takes an integer input from the user and prints the input and its factors. The program uses a for loop to iterate from the input number to 1 and checks if the input number is divisible by the current iteration number. If it is, the program prints the current iteration number and updates the value of the input number to the current iteration number. This process continues until the input number is 1.

In Python, we can achieve the same functionality using a for loop and the modulo operator. Here's the equivalent Python code:

```python
n = int(input())
print(n, end=' ')
for i in range(2, n+1):
    if n % i == 0:
        print(i, end=' ')
        n //= i
```

In this code, we first read the input integer from the user using the `input()` function and convert it to an integer using the `int()` function. We then print the input integer followed by a space using the `print()` function.

Next, we use a for loop to iterate from 2 to the input integer (inclusive). For each iteration, we check if the input integer is divisible by the current iteration number using the modulo operator (`%`). If it is, we print the current iteration number followed by a space using the `print()` function. We then update the value of the input integer by integer division (`//`) with the current iteration number. This process continues until the input integer is 1.

Note that we use the `end` parameter of the `print()` function to print the numbers and spaces on the same line.<|endoftext|>
