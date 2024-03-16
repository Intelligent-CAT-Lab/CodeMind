<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S=input()
if 'a' in S and 'b' in S and 'c' in S:
    print('Yes')
else:
    print('No')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains("a") && input.contains("b") && input.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use its `nextLine()` method to read a line of input from the user.

Next, we check if the input string contains the characters "a", "b", and "c" using the `contains()` method. If it does, we print "Yes" to the console. Otherwise, we print "No".

Note that in Java, we use the `contains()` method to check if a string contains a specific substring. In Python, we use the `in` operator to check if a substring is present in a string.</s>
