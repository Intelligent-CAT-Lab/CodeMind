<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print('2018'+input()[4:])

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
        String output = "2018" + input.substring(4);
        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `substring` method to extract the substring starting from the 4th character. The resulting string is then printed to the console.</s>
