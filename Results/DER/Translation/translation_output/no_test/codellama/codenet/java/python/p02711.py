<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n = int(input())
string = str(n)

if "7" in string:
    print("Yes")
else:
    print("No")
```
This is the equivalent Python code for the given Java code. The `Scanner` class in Java is replaced by the `input()` function in Python, which reads a line of input from the user and returns it as a string. The `String.valueOf()` method in Java is not needed in Python, as the `str()` function can be used to convert any object to a string. The `contains()` method in Java is replaced by the `in` operator in Python, which checks if a substring is present in a string.</s>
