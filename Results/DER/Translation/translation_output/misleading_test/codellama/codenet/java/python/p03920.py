<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
This is a Python implementation of the Java code provided. The `main()` function takes input from the user using `input()` and stores it in the variable `N`. The `while` loop iterates as long as `N` is greater than 0. Inside the loop, a `for` loop is used to calculate the sum of the numbers from 1 to `i` (where `i` is the current iteration of the loop). If the sum is greater than or equal to `N`, the loop is broken and the current value of `i` is printed. The value of `N` is then decremented by the current value of `i`.

The `sys.maxsize` is used to set the maximum value of `i` to the maximum value that can be stored in an integer in Python. This is necessary because the Java code uses an infinite loop to calculate the sum, which is not possible in Python.

The `if __name__ == "__main__":` block is used to execute the `main()` function when the script is run as a standalone program.</s>
