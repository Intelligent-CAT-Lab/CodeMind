Here's the equivalent Java code for the given Python code snippet:

```java
import java.util.Scanner;

public class PDReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                chars[i] = 'D';
            }
        }

        String output = new String(chars);
        System.out.println(output);
        
        scanner.close();
    }
}
```

To run the Java program, you would typically compile it using `javac` and then run it using `java`, providing an input when prompted:

1. Save the code to a file called `PDReplacer.java`.
2. Open a terminal or command prompt.
3. Navigate to the directory where you saved the file.
4. Compile the program by typing `javac PDReplacer.java` and press `Enter`.
5. Run the program by typing `java PDReplacer` and press `Enter`.
6. Enter your test input (for example, `PD?D??P`) and press `Enter`.

The expected output will then be printed to the console (in the example, the output will be `PDPDPDP`).
