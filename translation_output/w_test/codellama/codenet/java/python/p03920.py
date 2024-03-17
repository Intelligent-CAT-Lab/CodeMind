<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3


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
[/INST]
```
import sys

def main():
    N = int(input())
    while N > 0:
        sum = 0
        for i in range(1, sys.maxsize):
            sum += i
            if sum >= N:
                print(i)
                N -= i
                break

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code provided. It uses the `input()` function to read the input from the user, and the `range()` function to iterate over the numbers from 1 to infinity. The `sys.maxsize` constant is used to set the maximum value of the loop.

The `sum` variable is used to keep track of the sum of the numbers, and the `if` statement is used to check if the sum is greater than or equal to the input `N`. If it is, the `i` variable is printed and the loop is broken.

The `while` loop is used to continue the process until the input `N` is 0.

Note that this implementation is not as efficient as the Java implementation, as it uses a loop to iterate over the numbers from 1 to infinity, whereas the Java implementation uses a more efficient algorithm that only requires a single loop. However, this implementation is more straightforward and easier to understand for a beginner.</s>
