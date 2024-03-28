<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
0.5000000000


```
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```
[/INST]
```
import math

n = float(input())

odd = 0
not_odd = 0
for i in range(1, int(n) + 1):
    if i % 2 == 0:
        not_odd += 1
    else:
        odd += 1

print(odd / n)
```
This code uses the `input()` function to get the input from the user, and then it uses a `for` loop to iterate over the range of numbers from 1 to `n`, where `n` is the input. For each number, it checks if it is odd or not using the modulo operator `%`, and it increments the `odd` or `not_odd` variable accordingly. Finally, it prints the ratio of the number of odd numbers to the total number of numbers.

Note that in Python, the `input()` function returns a string, so we need to convert it to a float using the `float()` function before using it in the loop.</s>
