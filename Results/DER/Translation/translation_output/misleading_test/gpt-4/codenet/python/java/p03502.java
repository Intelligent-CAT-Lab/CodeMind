Here is the equivalent Java code for the given Python code snippet. In Java, you'll read from the standard input using a `Scanner`, iterate over the digits of the given integer, and check if the number is divisible by the sum of its digits.

```java
import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String list_N = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < list_N.length(); i++) {
            num += Character.getNumericValue(list_N.charAt(i));
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

You can use this code with your test input in a Java environment, and it should produce the expected output. Note, however, that the Python code provided and its expected output ";@G" do not match, as the logic in the Python code checks divisibility and prints "Yes" or "No", not ";@G".

Assuming you want the Java program to have the same logic as the Python code, the above Java translation will check the divisibility correctly. If the ";@G" output is intended for a different purpose, please clarify, and I will gladly help you with the Java translation for that.
