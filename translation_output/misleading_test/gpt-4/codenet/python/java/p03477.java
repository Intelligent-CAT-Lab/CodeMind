Below you'll find the Python code translated into Java:

```java
import java.util.Scanner;

public class BalanceScale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        if (A + B < C + D) {
            System.out.println("Right");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
        
        sc.close();
    }
}
```

This Java program should provide the desired output when provided with the test input "3 8 7 1".

Make sure to run this code in a Java environment and provide the input without any additional text or prompt, as the Scanner class reads from the standard input stream directly.
