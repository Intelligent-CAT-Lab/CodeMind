Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the value of `t` using the formula from the Python code, and then prints out the result.
