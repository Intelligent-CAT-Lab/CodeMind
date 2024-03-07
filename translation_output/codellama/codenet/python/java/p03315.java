<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a=input()
e=a.count("+")
f=a.count("-")
print(e-f)

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
        int plusCount = 0;
        int minusCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+') {
                plusCount++;
            } else if (input.charAt(i) == '-') {
                minusCount++;
            }
        }
        System.out.println(plusCount - minusCount);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it uses a `for` loop to iterate over the characters in the input string. For each character, it checks if it is a `+` or a `-`, and if it is, it increments the corresponding counter. Finally, it prints the difference between the number of `+` and `-` characters.</s>
