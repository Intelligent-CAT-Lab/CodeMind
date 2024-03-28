Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        boolean f = false;
        int ans = 0;
        
        int n = A * 100 / 8;
        int m = (A + 1) * 100 / 8;
        
        for (int i = n; i <= m; i++) {
            if (i * 8 / 100 == A && i / 10 == B) {
                f = true;
                ans = i;
                break;
            }
        }
        
        System.out.println(f ? ans : -1);
        scanner.close();
    }
}
```

Make sure to run this code within a class and using the correct package if required. You will also need to import `java.util.Scanner` for user input, and handle input and output using `System.in` and `System.out`.
