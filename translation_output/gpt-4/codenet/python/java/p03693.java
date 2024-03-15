Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Make sure you have the Java Development Kit (JDK) installed on your system to compile and run the Java code. This script takes three integers as input separated by spaces, exactly like the Python code, checks the condition and prints out the result.
