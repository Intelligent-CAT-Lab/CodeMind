Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String strN = Integer.toString(n);
        int num = 0;

        for (int i = 0; i < strN.length(); i++) {
            num += Character.getNumericValue(strN.charAt(i));
        }

        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, converts it to a string, and then iterates over each character in the string, converting it back to an integer and adding it to the total sum. If the original number is divisible by the sum of its digits, it prints "Yes", otherwise it prints "No".
