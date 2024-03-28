Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();

        int sn = 0;

        for (int i = 0; i < n.length(); i++) {
            sn += Character.getNumericValue(n.charAt(i));
        }

        if (Integer.parseInt(n) % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

You can use the following test case in Java to validate the code's correctness:

Test input:
```
12
```

Expected output:
```
Yes
```

Simply compile and run the `HarshadNumberCheck` class in a Java environment and provide the input `12` to get the expected output "Yes".
