Certainly! Here is the equivalent Java code for the Python code snippet you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading a line of input and splitting it into an array of strings
        String[] inputArray = scanner.nextLine().split(" ");
        
        // Iterating over the array and parsing integers, then checking for the value 0
        for (int e = 0; e < inputArray.length; e++) {
            int i = Integer.parseInt(inputArray[e]);
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
        }
        
        scanner.close();
    }
}
```

Place this code inside a file named `Main.java` or any other name you prefer for the class containing the `main` method. Note that in Java, you usually need to import the `Scanner` class for reading input and have a `main` method as the entry point of your application.
