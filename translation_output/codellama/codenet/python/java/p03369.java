<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
print(700+100*s.count("o"))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(700 + 100 * count);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `count` variable is used to keep track of the number of occurrences of the letter "o" in the input string. The `for` loop iterates over the characters in the input string and checks if each character is equal to "o". If it is, the `count` variable is incremented. Finally, the `System.out.println` method is used to print the result, which is the sum of 700 and 100 times the number of occurrences of "o" in the input string.</s>
