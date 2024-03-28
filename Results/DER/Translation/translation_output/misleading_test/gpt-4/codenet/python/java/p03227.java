Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        if(input.length() == 2) {
            System.out.println(input);
        } else {
            StringBuilder reversed = new StringBuilder(input).reverse();
            System.out.println(reversed.toString());
        }

        scanner.close();
    }
}
```

A few things to note in this translation:

1. Java uses the Scanner class to get input from the user.
2. A StringBuilder is created from the input String in order to reverse it since String objects are immutable in Java.
3. The reversed string is obtained by calling `toString()` on the StringBuilder object.
4. We assume that we need to prompt the user to enter a string, hence the `System.out.println("Enter the string:");` statement.
5. We include `scanner.close();` to release the Scanner resource, which is generally a good practice to prevent resource leaks.

You can compile and run this Java program, type in your test input ("abc"), and it will print out the expected output ("cba").
