<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print("ai1333" + "3" * int(int(input()) / 100))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class AI1333 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("ai1333");
    System.out.print("3".repeat(scanner.nextInt() / 100));
  }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `repeat()` method is used to repeat a string a certain number of times.
* The `System.out.print()` method is used to print the output to the console.

Note: The `repeat()` method is only available in Java 11 and later versions. If you are using an earlier version of Java, you can use a loop to repeat the string instead.</s>
