<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 13

Expected output:
98

```
import java.util.Scanner;

class p03328 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = b - a;
    System.out.println(n * (n + 1) / 2 - b);
  }
}

```

@@ Response
```python
# Python code

# Read input from user
a, b = map(int, input().split())

# Calculate the sum of numbers from a to b
n = b - a
sum_numbers = n * (n + 1) // 2

# Subtract b from the sum
result = sum_numbers - b

# Print the result
print(result)
```

Test input:
8 13

Expected output:
98<｜end▁of▁sentence｜>
