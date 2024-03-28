<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

string = input()
if string == "ARC":
  print("ABC")
else:
  print("ARC")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use its `nextLine()` method to read a line of input from the user.

Next, we check if the input string is equal to "ARC" using the `equals()` method. If it is, we print "ABC" to the console. Otherwise, we print "ARC" to the console.

Note that in Java, we use the `equals()` method to compare strings, rather than the `==` operator, which is used in Python. This is because `==` checks if two objects are the same object in memory, while `equals()` checks if two objects have the same value.</s>
