Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i < 100500; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean check(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
```

Please note that the `nextInt()` method is used to read an integer from the user input, similar to how `input()` is used in the Python code. The rest of the structure closely replicates the logic of the original Python code.
