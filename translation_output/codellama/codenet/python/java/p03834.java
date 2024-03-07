<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
print(s.replace(",", " "))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.replace(",", " "));
    }
}

This code uses the `Scanner` class to read input from the user, and the `replace` method to replace the commas with spaces.</s>
