Here's the Python code translated into Java.

```java
import java.util.Scanner;

public class DivisorsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int ans = 0;
        
        // Looping through the range and checking if c is divisible by i
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }

        // Outputting the result
        System.out.println(ans);
        
        scanner.close();
    }
}
```

Ensure to add proper error checking and handling as needed. This code assumes that the user will provide appropriate inputs (three integers separated by spaces) when prompted.
