Here's the Java equivalent of the Python code provided:

```java
import java.util.Scanner;

public class DivisorPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ▁ ");
                a = i;
            }
        }
        scanner.close();
    }
}
```

To test the code with the input provided (733035), just compile and run the Java program, then enter the number when prompted, and you should receive the expected output which will be:

```
733035 ▁ 244345 ▁ 48869 ▁ 1 ▁ 
```

Note that in Java we use `System.out.print` instead of `print` and all variables and operations need to be type-specific (`int` in this case). Java also requires explicit declaration of classes and the use of a `main` method as the entry point of the program. The `Scanner` class is used to read user input.

Also, the character in the end ('▁') is not standard ASCII and might not display correctly in all environments. If it doesn't display as expected, you might need to check the encoding settings of your Java environment or simply replace it with a single space or any other ASCII character.
