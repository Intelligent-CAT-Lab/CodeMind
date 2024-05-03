Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            int dfInt = Integer.parseInt(df);
            int smInt = Integer.parseInt(sm);
            if ((dfInt + smInt) % 2 == 0 && smInt >= dfInt && (smInt - dfInt) % 2 == 0) {
                ans += 1;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) ans += 1;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then iterates over each digit in the number. For each digit, it checks if the sum of the digits before and after it is even, if the sum is greater than or equal to the digit before it, and if the difference between the sum and the digit before it is even. If all these conditions are met, it increments the answer. Finally, it checks if the original number is even and increments the answer if it is. The result is then printed to the console.
