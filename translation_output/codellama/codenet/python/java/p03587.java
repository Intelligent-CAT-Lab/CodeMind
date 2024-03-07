<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
print(s.count("1"))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.length() - s.replace("1", "").length());
    }
}

This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `length()` method is used to get the length of the input string, and the `replace()` method is used to remove all occurrences of the character "1" from the string. The difference between the length of the original string and the length of the string after removing all occurrences of "1" is the number of occurrences of "1" in the string.</s>
