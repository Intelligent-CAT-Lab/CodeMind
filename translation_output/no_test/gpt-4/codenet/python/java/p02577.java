Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int tmp = 0;

        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Character.getNumericValue(n.charAt(i))) % 9;
        }

        if (tmp == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

Here's what I did:
- I used a `Scanner` object to take input from the user.
- I looped through the string `n`, converting each character to a numeric value using `Character.getNumericValue`.
- Then I applied the same logic to calculate `tmp`.
- Finally, I used if-else to check `tmp` and print "Yes" or "No".
- Don't forget to close the scanner at the end to prevent any resource leaks.
