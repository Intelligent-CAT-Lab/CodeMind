<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud

Expected output:
FLxhm mMuduhzn Rj;uk

```
print ( input ( ) . replace ( " , " , " â " ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", "â");
        System.out.println(output);
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `replace()` method is used to replace all occurrences of the string ", " with the string "â".
* The `System.out.println()` method is used to print the output to the console.

Note: The `â` character is a Unicode character that represents a hyphen. It is used to replace the comma in the input string.</s>
