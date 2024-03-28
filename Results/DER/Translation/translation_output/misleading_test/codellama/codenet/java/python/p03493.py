<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
101

Expected output:
59

```
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

```
[/INST]
```
import java.util.Scanner;

class p03493:

    def main(self):
        scanner = Scanner(System.in)
        a = scanner.next()
        marbles = 0
        for i in range(len(a)):
            if a[i] == '1':
                marbles += 1
        print(marbles)

```
This is the Python code for the given Java code. The `Scanner` class is used to read input from the user, and the `next()` method is used to read the input as a string. The `for` loop is used to iterate over the characters in the string, and the `if` statement is used to check if the current character is equal to `'1'`. If it is, the `marbles` variable is incremented. Finally, the `print()` function is used to output the value of `marbles`.</s>
