Certainly! Below is the Java equivalent of your provided Python code. In Java, you'd typically use the `Scanner` class for input and `System.out.println` for output. The `String` class in Java has a method `replace` which we can use to replace the commas with spaces.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // Read input line
        s = s.replace(",", " "); // Replace commas with spaces
        System.out.println(s); // Print the result
        scanner.close(); // Close the scanner
    }
}
```

This Java program will prompt for input when run, as per the Python example. Once you enter a string such as "happy,newyear,enjoy" and press Enter, it will output "happy newyear enjoy".
