Certainly! Here is the equivalent Java code for the Python code snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("2018" + inputString.substring(4));
        scanner.close();
    }
}
```

This Java code uses the `Scanner` class to read a line of input from the user, then concatenates the String "2018" with the substring of the input starting at index 4, same as the Python code does with `input()[4:]`, and finally prints the resulting string to the console.
