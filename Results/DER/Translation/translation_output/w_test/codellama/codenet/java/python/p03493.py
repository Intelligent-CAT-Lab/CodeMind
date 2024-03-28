<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
101

Expected output:
2


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
This is the Python code for the given Java code. The code uses the `Scanner` class to read input from the user, and then it iterates through the input string using a for loop. For each character in the string, it checks if it is equal to '1', and if it is, it increments the `marbles` variable. Finally, it prints the value of `marbles`.</s>
