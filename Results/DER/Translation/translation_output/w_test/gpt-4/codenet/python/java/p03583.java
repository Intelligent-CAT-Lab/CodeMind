Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                long tmp1 = (long) N * i * j;
                long tmp2 = 4L * i * j - (long) N * j - (long) N * i;
                
                if (tmp2 != 0) {
                    long s = tmp1 / tmp2;
                    long m = tmp1 % tmp2;
                    
                    if (m == 0 && s >= 0) {
                        System.out.println(i + " " + j + " " + s);
                        return;
                    }
                }
            }
        }
    }
}
```

This Java code should be compiled and run in a Java environment. It uses a scanner to take an integer input (N) from the user, then iterates through two nested loops to find the solution, and prints the result (n h w). If the conditions are met, it will terminate the program using a return statement after printing the output.
