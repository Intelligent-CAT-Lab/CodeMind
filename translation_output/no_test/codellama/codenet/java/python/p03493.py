<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Arrays;
import java.util.Scanner;

class p03493 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int marbles = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')marbles++;
        }
        System.out.println(marbles);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

def main():
    a = sys.stdin.readline().strip()
    marbles = 0
    for i in range(len(a)):
        if a[i] == '1':
            marbles += 1
    print(marbles)

if __name__ == '__main__':
    main()
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The rest of the code is similar to the Java code, with the exception of the `range()` function being used instead of the `for` loop with a counter variable.</s>
