<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b = map(int, input().split())
print(a*b, (a+b)*2)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
        System.out.println((a + b) * 2);
    }
}

This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `println()` method is used to print the output to the console.</s>
