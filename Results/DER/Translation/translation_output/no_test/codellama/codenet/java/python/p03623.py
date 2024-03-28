<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import math

x = int(input("Enter a number: "))
a = int(input("Enter another number: "))
b = int(input("Enter another number: "))

if abs(x - a) < abs(x - b):
    print("A")
else:
    print("B")
```
Note: The `abs()` function in Python is used to get the absolute value of a number.</s>
