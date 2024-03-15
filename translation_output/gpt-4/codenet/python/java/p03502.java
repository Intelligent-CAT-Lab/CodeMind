Here's the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        String nStr = Integer.toString(n);
        int num = 0;
        
        for (int i = 0; i < nStr.length(); i++) {
            num += Character.getNumericValue(nStr.charAt(i));
        }
        
        String ans = "No";
        
        if (n % num == 0) {
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}
```

This Java code does the following, equivalent to the Python code:
- It reads an integer from the user input.
- It converts the integer to a string to iterate over its digits.
- It sums up the digits of the number.
- It checks if the input number is divisible by the sum of its digits, and sets the answer accordingly.
- Finally, it outputs the answer.
