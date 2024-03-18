Here's the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
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

To test the code with input 3, you would run the program and enter 3 when prompted. The expected output will match as specified:

```
1 2 
2 
```
