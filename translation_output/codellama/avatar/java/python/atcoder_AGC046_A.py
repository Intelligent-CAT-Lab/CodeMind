<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int i;
        int k = 360;
        int j = 1;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.err.println("æ´æ°ãå¥åãã¦ãã ãã");
        }

        i = Integer.parseInt(sc.nextLine());

        if (1 <= i && i <= 179) {
            while (!((i * j) % k == 0)) {
                ++j;
            }
            System.out.println(j);
        } else {
            System.out.println("åè»¢ããè§åº¦ã¯ï¼ ï½ ï¼ï¼ï¼ã®éã§å¥åãã¦ãã ããã");
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

i = int(input())
k = 360
j = 1

if 1 <= i <= 179:
    while (i * j) % k != 0:
        j += 1
    print(j)
else:
    print("Invalid input")
```
This is the Python code equivalent to the Java code you provided. It uses the `input()` function to read a line of input from the user, and then uses the `int()` function to convert the input to an integer. The rest of the code is similar to the Java code, with the exception of the `print()` function, which is used to output the result to the console.</s>
