<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
c

Expected output:
d


```
print ( chr ( ord ( input ( ) ) + 1 ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);
        char d = (char) (c + 1);
        System.out.println(d);
    }
}
```
Explanation:

* `import java.util.Scanner;` imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
* `Scanner scanner = new Scanner(System.in);` creates a new `Scanner` object that reads input from the standard input stream (i.e., the keyboard).
* `String input = scanner.nextLine();` reads a line of input from the user and stores it in a `String` variable called `input`.
* `char c = input.charAt(0);` gets the first character of the input string and stores it in a `char` variable called `c`.
* `(char) (c + 1);` increments the value of `c` by 1 and casts it to a `char` type. This is equivalent to `c + 1` in Python.
* `System.out.println(d);` prints the result to the console.

Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print output to the console.</s>
