<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int hen = L / 3;
        System.out.println(hen * hen * hen);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the result to the console.</s>
