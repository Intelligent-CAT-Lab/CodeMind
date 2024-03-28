Certainly! Below is the translated Java code that reads three integers from the standard input and prints "Yes" if the sum of the first two integers is greater than or equal to the third integer, otherwise it prints "No".

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
```
You can use this Java code to test with the input `50 100 120` and it should provide the expected output `Yes`.
