<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 180 * (num - 2);

        System.out.println(answer);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import math

num = int(input("Enter a number: "))

answer = 180 * (num - 2)

print(answer)
```
In this code, we first import the `math` module, which is not used in the Java code. We then prompt the user to enter a number using the `input()` function, which is similar to the `Scanner` class in Java.

We then calculate the answer using the formula `180 * (num - 2)`, which is the same as the Java code. Finally, we print the answer using the `print()` function.

Note that the `input()` function in Python returns a string, so we need to convert it to an integer using the `int()` function before using it in the calculation.</s>
