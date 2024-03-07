<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a >= b:
    for i in range(a):
        print(b, end="")
else:
    for i in range(b):
        print(a, end="")
```
Note: The `map` function is used to convert the input strings to integers, and the `range` function is used to create a range of numbers from 0 to the input value. The `end` parameter in the `print` function is used to specify that the output should be printed on the same line.</s>
