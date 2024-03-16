<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

h, a = map(int, input().split())
n = h // a
if h % a > 0:
    n += 1

print(n)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input string to a list of integers, and the `//` operator is used for integer division. The `if` statement is used to check if the remainder of the division is greater than 0, and if it is, the `n` variable is incremented by 1. Finally, the `print` function is used to output the result.</s>
