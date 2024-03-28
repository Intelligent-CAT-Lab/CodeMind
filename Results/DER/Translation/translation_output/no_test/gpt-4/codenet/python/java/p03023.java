Below is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of sides of the polygon: ");
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        
        System.out.println(s);
        
        scanner.close();
    }
}
```

This Java code performs the same operation: it reads an integer (the number of sides of a polygon) from the user input, calculates the sum of the interior angles using the formula `180 * (n - 2)`, and then prints the result to the console. Remember to import the `Scanner` class, which is used for reading input in Java.
