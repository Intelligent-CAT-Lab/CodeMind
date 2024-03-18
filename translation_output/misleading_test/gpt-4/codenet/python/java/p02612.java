Below is the translated Python code into Java. I've created a simple Java program with a main method that takes an integer as an argument and prints the desired output. Since Java doesn't support reading from the console as seamlessly as Python, you would need to pass the input as a command-line argument or use a Scanner object to read from the console.

```java
public class ChangeCalculator {
    public static void main(String[] args) {
        // Assuming the input is provided as a command-line argument.
        int n = Integer.parseInt(args[0]);
        int result = 1000 - n % 1000;
        if (n % 1000 == 0) result = 0;
        System.out.println(result);
    }
}
```

In a real-world application, you would likely want to add error checks and handle any exceptions that could occur (for example, if a non-integer is passed as an argument).

To compile and run this Java program, if you saved it to a file called `ChangeCalculator.java`, you should execute:

```bash
javac ChangeCalculator.java
java ChangeCalculator 1900
```

This assumes that you have the JDK installed and the `java` command is available in your command-line environment.

If you want to read the input from the console instead of as a command-line argument, you can use the `Scanner` class as follows:

```java
import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1000 - n % 1000;
        if (n % 1000 == 0) result = 0;
        System.out.println(result);
        scanner.close();
    }
}
```

In this case, you compile the program in the same way, but you run it and then type the input:

```bash
java ChangeCalculator
1900
```

And it should output `102` as expected.
