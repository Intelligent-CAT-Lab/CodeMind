<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import sys

N = int(input())

while N > 0:
    sum = 0
    for i in range(1, N+1):
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break
```
Note: The `range` function in Python is similar to the `for` loop in Java, but it generates a sequence of numbers from 1 to N+1, and the `break` statement is used to exit the loop when the condition is met. The `input()` function is used to read a line of input from the user, and the `int()` function is used to convert the input to an integer.</s>
