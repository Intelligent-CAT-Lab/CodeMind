<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import math

def get_x(x):
    i = 1
    while i * (i + 1) / 2 < x:
        i += 1
    return i

x = int(input("Enter a number: "))
print(get_x(x))
```
This code uses the same logic as the Java code, but it is written in Python. It defines a function `get_x` that takes an integer `x` as input and returns the value of `i` that satisfies the condition `i * (i + 1) / 2 < x`. The function uses a `while` loop to iterate through the values of `i` until the condition is satisfied.

The main part of the code prompts the user to enter a number and then calls the `get_x` function with the input number as an argument. The result is then printed to the console.</s>
