Certainly! Below is the equivalent Java code that takes a string input from the user, replaces occurrences of " , " (including the spaces) with " ▁ " (I assume "â–" is a encoding mistake and you intended to use a whitespace character), and prints the result to the console.

```java
import java.util.Scanner;

public class StringReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(" , ", " ▁ ");
        System.out.println(output);
        scanner.close();
    }
}
```

Running this Java code with the test input you provided (`pnxnn,muduhzn,aquud`) would not produce the same output as the Python code you've shown without additional logic, because the Python code you've shown simply replaces the string " , " with " â– " and does not perform any other transformations.

To achieve the output "FLxhm mMuduhzn Rj;uk" from the input "pnxnn,muduhzn,aquud", some other transformations like character shifts or substitutions would need to take place. However, without clear rules on how those transformations are determined, translating to the expected output is not possible from the given Python code. If you have more information on the transformation rules, please provide them for a more accurate translation.
