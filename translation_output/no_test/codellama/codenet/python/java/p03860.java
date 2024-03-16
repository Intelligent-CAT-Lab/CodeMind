<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A,x,C=input().split()
print("A"+x[0]+"C")


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
        String[] tokens = input.split(" ");
        String A = tokens[0];
        String x = tokens[1];
        String C = tokens[2];
        System.out.println(A + x.charAt(0) + C);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into three parts based on the space character. It then uses the `charAt()` method to get the first character of the second string, and the `+` operator to concatenate the three strings together. Finally, it uses the `println()` method to print the result to the console.</s>
