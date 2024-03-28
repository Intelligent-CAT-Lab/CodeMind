Here is the equivalent Java code that performs the same functionality as the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();
        
        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```

This Java program will take two integers as input from the user and then process them in the same way as the Python script. If `n` is less than 10, it will add 100 times (10 minus `n`) to `r` and print out the result; otherwise, it will simply print out `r`. To run a test case, you can compile the Java program and run it by providing space-separated integer values for `n` and `r`, for example, `2 2919` which should output `3767`.
