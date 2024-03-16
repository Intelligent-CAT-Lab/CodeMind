Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class BitwiseOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n + 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = i ^ j;
                int ct = 0;
                while (x > 0) {
                    x /= 2;
                    ct++;
                }
                System.out.print(ct + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

To compile and run this Java code, you will need to save it to a file with the `.java` extension, such as `BitwiseOperation.java`, and then compile it using `javac BitwiseOperation.java`, and run it using `java BitwiseOperation`. You will then input the number `3` (or any other number you wish to test with), just as it was done in the Python code example.
