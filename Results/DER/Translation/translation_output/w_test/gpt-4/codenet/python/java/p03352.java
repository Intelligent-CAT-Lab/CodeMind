Sure! The equivalent Java code for the Python code you shared will look something like this:

```java
import java.util.Scanner;

public class FindMaxPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;

        for (int b = 1; b < x; b++) {
            for (int p = 2; ; p++) {
                if (Math.pow(b, p) <= x) {
                    ans = Math.max(ans, (int)Math.pow(b, p));
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

To use the above code:

1. Create a file named `FindMaxPower.java`.
2. Paste the code in the file.
3. Compile the Java code using `javac FindMaxPower.java`.
4. Run the compiled Java program with `java FindMaxPower`.
5. Input `10` when prompted.
6. The output will be `9`, which is the expected output as per the test case you provided.
