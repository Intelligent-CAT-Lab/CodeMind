Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-86

```
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```

### Response:
```python
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```

The given java code is a simple program that takes an integer input from the user and prints the average of the two middle numbers. The solution is to add 1 to the input integer and then divide it by 2. The output is then printed using the `printf()` method.

In Python, we can achieve the same functionality using the `input()` function to take input from the user and the `print()` function to print the output. Here's the equivalent Python code:

```python
N = int(input())
print((N + 1) // 2)
```

In this code, we first take an integer input from the user using the `input()` function and store it in the variable `N`. We then use integer division (`//`) to calculate the average of the two middle numbers and store it in the variable `avg`. Finally, we print the value of `avg` using the `print()` function.<|endoftext|>
