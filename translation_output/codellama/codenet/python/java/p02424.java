<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))



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

        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
    }
}

The Java code uses the `Scanner` class to read input from the user, and the `Integer.toBinaryString()` method to convert the integers to binary strings. The `System.out.println()` method is used to print the binary strings to the console.</s>
