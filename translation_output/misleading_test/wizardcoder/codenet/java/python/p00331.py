Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-3 3

Expected output:
-25

```
import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int R = sc.nextInt();

            if ( H < 0 && Math.abs(H) == R ) {
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}


```

### Response:
```python
import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int R = sc.nextInt();

            if ( H < 0 and Math.abs(H) == R ) {
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
```

The given java code is a simple program that takes two integers as input from the user and prints the output based on the conditions mentioned in the problem statement. The code uses the Scanner class to read input from the user.

In Python, we can use the same logic to solve the problem. We can use the `input()` function to read input from the user and convert it to integer using the `int()` function. We can use the `print()` function to print the output to the user.

Here's the Python code that implements the same logic as the given java code:

```python
while True:
    try:
        H = int(input())
        R = int(input())
        if H < 0 and abs(H) == R:
            print(0)
        elif H + R > 0:
            print(1)
        else:
            print(-1)
    except ValueError:
        break
```

In this code, we use a `while` loop to keep asking the user for input until they enter a valid integer. We use a `try-except` block to catch the `ValueError` exception that is raised when the user enters a non-integer value. In this case, we simply break out of the loop and terminate the program.

The `if` statements in the java code are translated to `if` statements in Python. The `Math.abs()` function is replaced with the `abs()` function in Python. The `&&` operator is replaced with the `and` operator in Python. The `!` operator is replaced with the `not` operator in Python. The `Math.PI` constant is not available in Python, so we can use the value `3.141592653589793` instead.<|endoftext|>
