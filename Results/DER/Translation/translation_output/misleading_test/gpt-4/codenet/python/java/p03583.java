Here is the Python code translated into Java. I have also included the java.util.Scanner class for user input and System.exit(0) to replicate the functionality of `exit()` from the original Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int n = 0;
        int h = 0;
        int w = 0;
        
        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                long tmp1 = (long) N * i * j;
                long tmp2 = 4L * i * j - (long) N * j - (long) N * i;
                if (tmp2 != 0) {
                    long s = tmp1 / tmp2;
                    long m = tmp1 % tmp2;
                    if (m == 0 && s >= 0) {
                        n = i;
                        h = j;
                        w = (int) s;
                        System.out.println(n + " " + h + " " + w);
                        System.exit(0);
                    }
                }
            }
        }
        
        scanner.close();
    }
}
```

Here are some key differences to note:
- Java's System.exit(0) is used to exit the program, which requires returning from the main method first or directly exiting from a static context.
- Variables and loop counters are explicitly typed as `int` or `long` in Java.
- Java's Scanner class is used for reading input from the user, and you must remember to close it after use.
- Division (`/`) and modulo (`%`) operations work the same way in Java as in Python for integers.
- The `printf` function in Java is replaced with the `println` function combined with string concatenation.
- I also used explicit type casting and `long` type for the temporary variables `tmp1` and `tmp2` to avoid integer overflow given the large possible values of `i` and `j`.
