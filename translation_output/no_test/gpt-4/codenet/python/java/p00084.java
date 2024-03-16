Certainly! Below is the Java equivalent of the provided Python code. 

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] splitCode = code.split("\\s+");

        ArrayList<String> list = new ArrayList<>();

        for(String var : splitCode) {
            if(var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for(String var : list) {
            System.out.print(var + " ");
        }
        scanner.close();
    }
}
```

Please note the following differences and clarifications:
- Java's equivalent to `raw_input()` in Python is using a `Scanner` object to read from `System.in`.
- In Java, strings are immutable, so each transformation operation returns a new string.
- To split a string, Java's `split` method uses regular expressions, hence `\\s+` is used to split the input string into an array using one or more whitespace characters as the delimiter.
- In Python, `list` is a name representing a list data type, but in Java, it's good practice to avoid using `list` as a variable name because `List` is an interface name in the Java Collections Framework. In Java, variable names typically start with a lowercase letter and use camelCase.
- Java does not have a direct equivalent of Python's `print` function that prints without a newline. In this Java program, I used `System.out.print(var + " ")` to achieve a similar result.
- The print statement is followed by a space to mimic the comma behavior at the end of the `print` function in Python which ensures the variables are printed on the same line separated by spaces.
- It's important to close the `Scanner` at the end to avoid resource leaks.
