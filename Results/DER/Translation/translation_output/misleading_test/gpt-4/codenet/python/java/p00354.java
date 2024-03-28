Here's the Python code translated into Java. Make sure to include the necessary imports and error checks if you use this code in a production environment.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        String[] Day = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int a = X % 7;
        
        if (a == 2 || a == 3) {
            System.out.println(Day[a + 3]);
        } else if (a == 4 || a == 5 || a == 6) {
            System.out.println(Day[a - 4]);
        } else if (a == 0 || a == 1) {
            System.out.println(Day[a + 3]);
        }
        
        scanner.close();
    }
}
```

In the provided Java code, I've included a `Scanner` object to accept user input from the standard input stream (which is a common way to read input in Java). The logic of the code directly reflects the Python code, and uses an array of strings for day names.

To compile and run your program, save the code to a file called `Main.java` and execute the following commands in your terminal:

```
javac Main.java
java Main
```

Upon execution, you can input a number to see the corresponding day printed to the console, similar to the Python script behavior. For the given test input (1), the expected output would be 'fri>'.
