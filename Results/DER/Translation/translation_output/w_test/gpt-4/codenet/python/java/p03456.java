Here's the translated Java code based on the given Python code. It reads from standard input (`System.in`), just like the Python code reads from `sys.stdin`. The main logic of checking whether the concatenated number is a perfect square is preserved.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        input.close();

        int n = Integer.parseInt(a + b);
        int sqrtn = (int) Math.sqrt(n);

        boolean found = false;
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No");
        }
    }
}
```

To use this Java program, you should compile it and then run the compiled class. You can provide the input "1 21" through standard input and it will output "Yes" as expected for the provided test case.
