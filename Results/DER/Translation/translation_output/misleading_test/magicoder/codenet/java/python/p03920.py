<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
29
-60

```
import java.util.Scanner;

public class p03920 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    while (N > 0) {
      int sum = 0;
      for (int i = 1; ; i++) {
        sum += i;
        if (sum >= N) {
          System.out.println(i);
          N -= i;
          break;
        }
      }
    }
  }

}

```

@@ Response
```python
def p03920():
    N = int(input())
    while N > 0:
        sum = 0
        for i in range(1, N+1):
            sum += i
            if sum >= N:
                print(i)
                N -= i
                break

p03920()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then calculates the sum of the first `i` numbers (where `i` is a positive integer) until the sum is greater than or equal to the input number. It then prints `i` and subtracts `i` from the input number. This process repeats until the input number is zero.<｜end▁of▁sentence｜>
