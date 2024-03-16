Here is the equivalent Java code for the provided Python code. The Java code reads a string from the console input, checks if the last character is 's', and adds 'es' or 's' accordingly. 

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        if (s.endsWith("s")) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
        
        scanner.close();
    }
}
```

In this Java code:

1. We import the `Scanner` class for taking input from the user.
2. We define a public class named `Main` with the main method.
3. Inside the main method, we create a `Scanner` object to read input from standard input (the console).
4. We read a line of input and store it in the string variable `s`.
5. We use the `endsWith` method to check if the string ends with the letter "s".
6. Based on the condition, we print the modified string to the console output.

To run the Java code:
- Compile: `javac Main.java`
- Run: `java Main`
- Provide the input (e.g., "apple") and press Enter.
