Certainly! Below is the translated code from Python to Java:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split("\\s+");
        
        ArrayList<String> list = new ArrayList<>();
        
        for (String var : words) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }
        
        for (String var : list) {
            System.out.print(var + " ");
        }
        scanner.close();
    }
}
```

To compile and run the above program, you can follow these steps:

1. Save the code in a file called `Main.java`.
2. Compile the code using the `javac Main.java` command in your command-line interface (CLI).
3. Run the program using the `java Main` command in your CLI.
4. Provide the test input when prompted.

Your expected output will then be printed to the console.
