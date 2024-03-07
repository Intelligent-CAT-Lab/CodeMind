<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        char upper = lines[1].charAt(0);
        System.out.println("A" + upper +"C");
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

lines = sys.stdin.readline().split()
upper = lines[1][0]
print("A" + upper + "C")
```
In this code, we use the `sys` module to read the input from the standard input stream. We then split the input into a list of strings using the `split()` method, and extract the first character of the second string using the `charAt()` method. Finally, we print the output using the `print()` function.</s>
