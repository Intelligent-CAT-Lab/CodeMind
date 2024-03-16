<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import math

n = float(input("Enter a number: "))

odd = 0
not_odd = 0
for i in range(1, int(n) + 1):
    if i % 2 == 0:
        not_odd += 1
    else:
        odd += 1

print(odd / n)
```
Note: The `float()` function is used to convert the input to a floating-point number, since the `input()` function returns a string. The `range()` function is used to create a sequence of numbers from 1 to `n`, and the `int()` function is used to convert the result of the `range()` function to an integer.</s>
