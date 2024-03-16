<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = input.length() - input.replace("WB", "").length() - input.replace("BW", "").length();
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses the `length()` method to get the length of the input string. It then uses the `replace()` method to remove all occurrences of "WB" and "BW" from the input string, and then subtracts the length of the resulting string from the original length to get the number of "WB" and "BW" pairs. Finally, it prints the result to the console.</s>
