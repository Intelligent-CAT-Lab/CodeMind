Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}
```

To match your test case, you would run the Main class, input your test string "pnxnn,muduhzn,aquud" and the expected output "pnxnn muduhzn aquud" should be printed to the console. 

Note: In the Python code, it seems there is a space before and after the comma in the `replace` function (`" , "`), which means it's looking to replace the sequence of space-comma-space with another string. However, the test input does not contain spaces before and after the commas, so for the Java code, I assumed you just want to replace the comma `,` with a space ` `. If you actually need to replace the sequence of space-comma-space, the `replace` statement in Java would be `input.replace(" , ", " ")`.
