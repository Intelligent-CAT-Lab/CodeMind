Here is the equivalent Java code based on the provided Python code:

```java
import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toString(n);
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            num += Character.getNumericValue(s.charAt(i));
        }

        String ans = "No";
        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

You would run this Java program and input the number `12`. The expected output would be `Yes`, just like in the Python sample test case provided.
