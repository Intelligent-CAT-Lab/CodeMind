<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```

### Response:
```python
import sys

def main():
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())

    ans = (A + B) % 24
    print(ans)

if __name__ == "__main__":
    main()
```

In Python, we use `sys.stdin.readline().strip()` to read input from the console. The `%` operator is used as a substitute for the ternary operator in Java. It calculates the remainder of the division of the sum of A and B by 24. This gives us the same result as the ternary operator in the Java code.
<|EOT|>
