<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a=input().upper()
print(a)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        System.out.println(input);
    }
}

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use its `nextLine()` method to read a line of input from the user. We then convert the input to uppercase using the `toUpperCase()` method and print it to the console using `System.out.println()`.</s>
