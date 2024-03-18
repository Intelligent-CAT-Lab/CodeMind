To translate the given Python code to Java, you need to take care of different aspects including the way input is handled, the different libraries used for mathematical operations, and the syntax differences between Python and Java. Here is the Java equivalent for the Python code provided:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close(); // Close the scanner
        
        // Printing the result of ceiling division
        System.out.println((int) Math.ceil((double) h / a));
    }
}
```

When you input "10000 1" into this Java program, it will output "9911", just as expected. However, for the input "10000 1", the actual expected output should be "10000", not "9911". The output "9911" doesn't relate to the input "10000 1" as per the Python code you've provided if it's executed correctly. I've reproduced the Java code assuming that "10000 1" is the input, and the Python code has the correct expected behavior intending to output "10000".
