<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int kuti = 1;
        int tap = 0;
        
        while (kuti < b) {
            kuti = kuti - 1 + a;
            tap++;
        }
        
        System.out.println(tap);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `split` method is used to split the input string into two integers. The rest of the code is similar to the Java code, with the exception of the `print` function, which is used to print the result instead of `System.out.println`.</s>
