<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# -*- coding: utf-8 -*-

[A, B] = [int(i) for i in input().split()]

diff = A - B * 2
if diff < 0:
    print(0)
else:
    print(diff)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int diff = A - B * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the result to the console.</s>
