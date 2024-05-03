Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //2æ¬¡æ¹ç¨å¼ãè§£ã
        int t = (int)(Math.sqrt(-1+(1+8*x))/2);

        if (t * (t+1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t+1);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the integer part of the square root of the equation `-1+(1+8*x)`, and then checks if the sum of the first `t` natural numbers is greater than or equal to `x`. If it is, it prints `t`, otherwise it prints `t+1`.
