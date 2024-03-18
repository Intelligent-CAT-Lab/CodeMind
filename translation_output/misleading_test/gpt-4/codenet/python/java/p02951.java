Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int get = A - B;
        int i = C - get;
        
        if (i < 0) {
            i = 0;
        }
        
        System.out.println(i);
        
        scanner.close();
    }
}
```

When you run this Java program and input "6 4 3", the expected output will be "10".
